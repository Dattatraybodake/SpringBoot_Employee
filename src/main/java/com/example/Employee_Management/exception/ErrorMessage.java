package com.example.Employee_Management.exception;

public class ErrorMessage {
	private int statuscode;
	private String message;
	
	

	public int getStatuscode() {
		return statuscode;
	}



	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public ErrorMessage(int statuscode, String message)
	{
		this.message=message;
		this.statuscode=statuscode;
	}
}
