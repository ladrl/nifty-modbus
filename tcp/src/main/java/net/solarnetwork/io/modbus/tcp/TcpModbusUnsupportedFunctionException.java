/* ==================================================================
 * TcpModbusUnsupportedFunctionException.java - 22/01/2026 1:34:15 pm
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

package net.solarnetwork.io.modbus.tcp;

import org.jspecify.annotations.Nullable;
import net.solarnetwork.io.modbus.ModbusUnsupportedFunctionException;

/**
 * Unsupported function exception for TCP.
 *
 * @author matt
 * @version 1.0
 */
public class TcpModbusUnsupportedFunctionException extends ModbusUnsupportedFunctionException {

	private static final long serialVersionUID = 503468691363634488L;

	private final int transactionId;

	/**
	 * Constructor.
	 * 
	 * @param code
	 *        the unsupported function code
	 * @param unitId
	 *        the unit ID
	 * @param transactionId
	 *        the transaction ID
	 */
	public TcpModbusUnsupportedFunctionException(byte code, short unitId, int transactionId) {
		super(code, unitId);
		this.transactionId = transactionId;
	}

	/**
	 * Constructor.
	 * 
	 * @param code
	 *        the unsupported function code
	 * @param unitId
	 *        the unit ID
	 * @param transactionId
	 *        the transaction ID
	 * @param message
	 *        the message
	 */
	public TcpModbusUnsupportedFunctionException(byte code, short unitId, int transactionId,
			String message) {
		super(code, unitId, message);
		this.transactionId = transactionId;
	}

	/**
	 * Constructor.
	 * 
	 * @param code
	 *        the unsupported function code
	 * @param unitId
	 *        the unit ID
	 * @param transactionId
	 *        the transaction ID
	 * @param cause
	 *        the cause
	 */
	public TcpModbusUnsupportedFunctionException(byte code, short unitId, int transactionId,
			@Nullable Throwable cause) {
		super(code, unitId, cause);
		this.transactionId = transactionId;
	}

	/**
	 * Constructor.
	 * 
	 * @param code
	 *        the unsupported function code
	 * @param unitId
	 *        the unit ID
	 * @param transactionId
	 *        the transaction ID
	 * @param message
	 *        the message
	 * @param cause
	 *        the cause
	 */
	public TcpModbusUnsupportedFunctionException(byte code, short unitId, int transactionId,
			String message, @Nullable Throwable cause) {
		super(code, unitId, message, cause);
		this.transactionId = transactionId;
	}

	/**
	 * Get the transaction ID.
	 * 
	 * @return the transaction ID
	 */
	public int getTransactionId() {
		return transactionId;
	}

}
