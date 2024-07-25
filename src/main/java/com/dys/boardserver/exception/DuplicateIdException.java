package com.dys.boardserver.exception;

public class DuplicateIdException extends RuntimeException {
	public DuplicateIdException(String msg) {
		super(msg);
	}
}
