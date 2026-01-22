/* ==================================================================
 * TcpModbusUnsupportedFunctionExceptionTests.java - 22/01/2026 1:37:36 pm
 *
 * Copyright 2026 SolarNetwork.net Dev Team
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
 * 02111-1307 USA
 * ==================================================================
 */

package net.solarnetwork.io.modbus.tcp.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;
import java.security.SecureRandom;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import net.solarnetwork.io.modbus.tcp.TcpModbusUnsupportedFunctionException;

/**
 * Test cases for the {@link TcpModbusUnsupportedFunctionException} class.
 *
 * @author matt
 * @version 1.0
 */
public class TcpModbusUnsupportedFunctionExceptionTests {

	private static final SecureRandom RNG = new SecureRandom();

	@Test
	public void construct() {
		// GIVEN
		final byte code = 0xA;
		final short unitId = (short) RNG.nextInt(Short.MAX_VALUE);
		final int transactionId = RNG.nextInt(Integer.MAX_VALUE);

		// WHEN
		TcpModbusUnsupportedFunctionException e = new TcpModbusUnsupportedFunctionException(code, unitId,
				transactionId);

		// THEN
		assertThat("Code preserved", e.getCode(), is(equalTo(code)));
		assertThat("Unit ID preserved", e.getUnitId(), is(equalTo(unitId)));
		assertThat("Transaction ID preserved", e.getTransactionId(), is(equalTo(transactionId)));
		assertThat("No message", e.getMessage(), is(nullValue()));
		assertThat("No cause", e.getCause(), is(nullValue()));
	}

	@Test
	public void construct_message() {
		// GIVEN
		final byte code = 0xA;
		final short unitId = (short) RNG.nextInt(Short.MAX_VALUE);
		final int transactionId = RNG.nextInt(Integer.MAX_VALUE);
		final String m = UUID.randomUUID().toString();

		// WHEN
		TcpModbusUnsupportedFunctionException e = new TcpModbusUnsupportedFunctionException(code, unitId,
				transactionId, m);

		// THEN
		assertThat("Code preserved", e.getCode(), is(equalTo(code)));
		assertThat("Unit ID preserved", e.getUnitId(), is(equalTo(unitId)));
		assertThat("Transaction ID preserved", e.getTransactionId(), is(equalTo(transactionId)));
		assertThat("Message preserved", e.getMessage(), is(equalTo(m)));
		assertThat("No cause", e.getCause(), is(nullValue()));
	}

	@Test
	public void construct_cause() {
		// GIVEN
		final byte code = 0xA;
		final short unitId = (short) RNG.nextInt(Short.MAX_VALUE);
		final int transactionId = RNG.nextInt(Integer.MAX_VALUE);
		final Throwable t = new Throwable(UUID.randomUUID().toString());

		// WHEN
		TcpModbusUnsupportedFunctionException e = new TcpModbusUnsupportedFunctionException(code, unitId,
				transactionId, t);

		// THEN
		assertThat("Code preserved", e.getCode(), is(equalTo(code)));
		assertThat("Unit ID preserved", e.getUnitId(), is(equalTo(unitId)));
		assertThat("Transaction ID preserved", e.getTransactionId(), is(equalTo(transactionId)));
		assertThat("Message from cause", e.getMessage(), is(t.toString()));
		assertThat("Cause preserved", e.getCause(), is(sameInstance(t)));
	}

	@Test
	public void construct_messageAndCause() {
		// GIVEN
		final byte code = 0xA;
		final short unitId = (short) RNG.nextInt(Short.MAX_VALUE);
		final int transactionId = RNG.nextInt(Integer.MAX_VALUE);
		final String m = UUID.randomUUID().toString();
		final Throwable t = new Throwable();

		// WHEN
		TcpModbusUnsupportedFunctionException e = new TcpModbusUnsupportedFunctionException(code, unitId,
				transactionId, m, t);

		// THEN
		assertThat("Code preserved", e.getCode(), is(equalTo(code)));
		assertThat("Unit ID preserved", e.getUnitId(), is(equalTo(unitId)));
		assertThat("Transaction ID preserved", e.getTransactionId(), is(equalTo(transactionId)));
		assertThat("Message preserved", e.getMessage(), is(equalTo(m)));
		assertThat("Cause preserved", e.getCause(), is(sameInstance(t)));
	}

}
