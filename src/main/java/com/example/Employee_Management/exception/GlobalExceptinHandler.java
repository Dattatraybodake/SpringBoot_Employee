package com.example.Employee_Management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptinHandler {

	@ExceptionHandler(value=EmployeeNotFoundException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public @ResponseBody ErrorMessage handleEmployeeException(EmployeeNotFoundException exception)
	{
	return new ErrorMessage(HttpStatus.NO_CONTENT.value(), exception.getMessage());
	
	}
}