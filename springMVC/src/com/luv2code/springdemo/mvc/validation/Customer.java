package com.luv2code.springdemo.mvc.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.customValidation.CourseCode;

public class Customer {

	private String firstName;
	
	@CourseCode //can give value and default error message
	private String courseCode;
	
	@NotNull(message="is required")
	@Min(value=0,message="must be greater than equal to 0")
	@Max(value=10,message="must be less than or equal to 10")
	private Integer freepass; //instead of "int" used "Integer" becoz if int field left blank spring tyr to convert it to String causing type error
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 digits/characters")
	private String postalCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreepass() {
		return freepass;
	}
	public void setFreepass(Integer freepass) {
		this.freepass = freepass;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}
