package com.java.training.tests.exceptions.exceptionstest;


public class CheckedException extends Exception{

	@Override
	public String getMessage() {
		return "Message from Checked Exception";
	}
    
}
