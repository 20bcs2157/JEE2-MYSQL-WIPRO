package com.capstone.exception;

public class InvalidDataException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidDataException() {

	}

	public InvalidDataException(String message) {
		super(message);
	}
}