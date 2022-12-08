package com.event.exception;

public class NoEventException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public NoEventException() {
		super("No event found");
	}
}
