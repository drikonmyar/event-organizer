package com.event.exception;

public class PasswordMismatchException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public PasswordMismatchException() {
		super("Incorrect password");
	}
}
