package com.luv2code.springdemo.mvc.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeContraintValidatior 
	implements ConstraintValidator<CourseCode,String>{

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix=theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		if (theCode!=null) {
			boolean result=theCode.startsWith(coursePrefix);
			if(result)
				return true;
		}
		return false;
	}

}
