package org.naga.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class SpringRestController {
 @RequestMapping(value = "/{version}/{name}", method = RequestMethod.GET)
 public String hello(@PathVariable String version,@PathVariable String name) {
	 System.out.println("............");
  String result="Hello "+name+"Version..."+version;  
  return result;
 }
 @RequestMapping(value = "/{version}/api/{firstName}", method = RequestMethod.GET )
 
 public ResponseEntity<Employee> listObject(@PathVariable String version,@PathVariable String firstName) throws EmployeeNotFoundException{
	
  Employee emp;
  emp = new Employee();
  emp.setEmpId(123);
  emp.setFirstName(firstName);
  if (firstName.equalsIgnoreCase("123")) {
	   throw new EmployeeNotFoundException("Invalid employee name requested");
	          }
  return new ResponseEntity<Employee>(emp,HttpStatus.OK);
 }
 
 @ExceptionHandler(EmployeeNotFoundException.class)
 public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
         ErrorResponse error = new ErrorResponse();
         error.setErrorCode(HttpStatus.PRECONDITION_FAILED.value());
         error.setMessage(ex.getMessage());
         return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
     }

 }