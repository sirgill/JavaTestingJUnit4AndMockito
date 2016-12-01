package com.gill.order.bo.exception;

import java.sql.SQLException;

public class BOException extends Exception {

	private static final long serialVersionUID = 1L;

	public BOException(final SQLException e) {
		super(e);
	}

}
