package com.cts.vehicle.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DuplicateEntryException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateEntryException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
