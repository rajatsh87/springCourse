package com.luv2code.springdemo.mvc;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("student",new Student());
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("first name:"+theStudent.getFirstName());
		System.out.println("lase name:"+theStudent.getLastName());
		System.out.println("country:"+theStudent.getCountry());
		System.out.println("favoritieLang:"+theStudent.getFavoritieLanguage());
		System.out.println("OS:"+Arrays.toString(theStudent.getOS()));
		return "student-confirmation";
	}
	
}
