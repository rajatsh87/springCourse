package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

		
		@ExceptionHandler
		public ResponseEntity<CustomerErrorResponse> handelExceptions(CustomerNotFoundException exe){
			CustomerErrorResponse res=new 
					CustomerErrorResponse(HttpStatus.NOT_FOUND.value(),exe.getMessage(),System.currentTimeMillis());
			
			return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
		}
		
		@ExceptionHandler
		public ResponseEntity<CustomerErrorResponse> handelExceptions(Exception exe){
			CustomerErrorResponse res=new 
					CustomerErrorResponse(HttpStatus.BAD_REQUEST.value(),exe.getMessage(),System.currentTimeMillis());
			
			return new ResponseEntity<>(res,HttpStatus.BAD_REQUEST);
		}
		
}
