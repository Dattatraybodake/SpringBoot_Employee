package com.example.Employee_Management.exception;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@ControllerAdvice
public class GlobalExceptinHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value=EmployeeNotFoundException.class)
	public @ResponseBody ErrorMessage handleEmployeeException(EmployeeNotFoundException exception)
	{
	return new ErrorMessage(HttpStatus.NO_CONTENT.value(), exception.getMessage());
	
	}


	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

		List<ObjectError> errors=ex.getAllErrors();
		Map<String,String> error=new HashMap<>();

		errors.stream().forEach(e ->{
			error.put(((FieldError) e).getField(),e.getDefaultMessage());
		});

		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}


	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorDetails> GlobalException(Exception e,WebRequest request){
		ErrorDetails errorDetails=new ErrorDetails(e.getMessage(), LocalDateTime.now(),request.getDescription(false),"Internal_Server_Error");
		return new ResponseEntity<>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}