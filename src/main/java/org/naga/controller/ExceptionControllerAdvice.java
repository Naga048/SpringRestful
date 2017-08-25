package org.naga.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionControllerAdvice {
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
		   ErrorResponse error = new ErrorResponse();
		   error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		   error.setMessage("Please contact your administrator");
		   return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
		 }

}
