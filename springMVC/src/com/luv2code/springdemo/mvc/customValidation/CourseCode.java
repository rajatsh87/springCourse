package com.luv2code.springdemo.mvc.customValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeContraintValidatior.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	public String value() default "LUV"; //if no value given then it checks for 
	
	public String message()default "must start with LUV"; // if no err mess gives the mess
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
}
