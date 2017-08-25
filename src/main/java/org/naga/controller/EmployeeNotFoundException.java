package org.naga.controller;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="This employee is not found in the system")
public class EmployeeNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;
	 public String getErrorMessage() {
	     return errorMessage;
	    }
	    public  EmployeeNotFoundException(String errorMessage) {
	        super(errorMessage);
	        this.errorMessage = errorMessage;
	    }
	    public EmployeeNotFoundException() {
	        super();
	    }


	
}
