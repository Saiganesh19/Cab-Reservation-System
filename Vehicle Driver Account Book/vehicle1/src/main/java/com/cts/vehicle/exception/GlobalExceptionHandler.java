package com.cts.vehicle.exception;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.cts.vehicle.model.ErrorModel;


@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(IdNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorModel handleIdNotFoundException(IdNotFoundException ex,WebRequest req)
	{
		ErrorModel error=new ErrorModel(new Date(0),403,"NOT FOUND",ex.getMessage(),req.getDescription(false));
		return error;
	}

	@ExceptionHandler(DuplicateEntryException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorModel handleDuplicateEntryException(DuplicateEntryException ex,WebRequest req)
	{
		ErrorModel error=new ErrorModel(new Date(0),403,"BAD REQUEST",ex.getMessage(),req.getDescription(false));
		return error;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorModel handleGlobalException(Exception ex,WebRequest req)
	{
		ErrorModel error=new ErrorModel(new Date(0),403,"BAD REQUEST",ex.getMessage(),req.getDescription(false));
		return error;
	}

}
