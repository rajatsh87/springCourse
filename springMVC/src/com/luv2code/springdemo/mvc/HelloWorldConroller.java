package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldConroller {
	
	//need a controller method to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	//controller method to read form data and add data to model
	
	@RequestMapping("/formV2")
	public String toUpper(@RequestParam("StudentName")String name, Model model) {
		
		
		//read the request parameter from HTML form
		//public String toUpper(HttpServletRequest req, Model model)
		//String name=req.getParameter("StudentName");
		
		//buisness logic
		name=name.toUpperCase();
		//System.out.println(name);
		
		//add message to model in key value pair
		model.addAttribute("newName",name);
		return "helloWorld";
	}
}
