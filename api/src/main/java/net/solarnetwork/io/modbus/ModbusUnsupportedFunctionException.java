/* ==================================================================
 * ModbusUnsupportedFunctionException.java - 22/01/2026 1:29:17 pm
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

package net.solarnetwork.io.modbus;

/**
 * Unsupported function exception.
 *
 * @author matt
 * @version 1.0
 */
public class ModbusUnsupportedFunctionException extends ModbusException {

	private static final long serialVersionUID = 5017096003505313786L;

	private final byte code;
	private final short unitId;

	/**
	 * Constructor.
	 *
	 * @param code
	 *        the unsupported function code
	 * @param unitId
	 *        the unit ID
	 */
	public ModbusUnsupportedFunctionException(byte code, short unitId) {
		super();
		this.code = code;
		this.unitId = unitId;
	}

	/**
	 * Constructor.
	 *
	 * @param code
	 *        the unsupported function code
	 * @param unitId
	 *        the unit ID
	 * @param message
	 *        the message
	 */
	public ModbusUnsupportedFunctionException(byte code, short unitId, String message) {
		super(message);
		this.code = code;
		this.unitId = unitId;
	}

	/**
	 * Constructor.
	 *
	 * @param code
	 *        the unsupported function code
	 * @param unitId
	 *        the unit ID
	 * @param cause
	 *        the cause
	 */
	public ModbusUnsupportedFunctionException(byte code, short unitId, Throwable cause) {
		super(cause);
		this.code = code;
		this.unitId = unitId;
	}

	/**
	 * Constructor.
	 *
	 * @param code
	 *        the unsupported function code
	 * @param unitId
	 *        the unit ID
	 * @param message
	 *        the message
	 * @param cause
	 *        the cause
	 */
	public ModbusUnsupportedFunctionException(byte code, short unitId, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
		this.unitId = unitId;
	}

	/**
	 * Get the unsupported function code.
	 *
	 * @return the code
	 */
	public byte getCode() {
		return code;
	}

	/**
	 * Get the unit ID.
	 *
	 * @return the unit ID
	 */
	public short getUnitId() {
		return unitId;
	}

}
