package com.ing.mortgage.exception;

import java.io.Serializable;

public class ExistEmailException extends RuntimeException implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String MESSAGE = "Email id already exist..";

	public ExistEmailException() {
		super(MESSAGE);
	}

}
