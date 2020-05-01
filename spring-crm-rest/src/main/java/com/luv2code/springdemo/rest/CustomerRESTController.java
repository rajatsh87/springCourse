package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRESTController {
	@Autowired
	private CustomerService cusService;
	
	@GetMapping("/customers")
	private List<Customer> getCustomers(){
		List<Customer> cus=new ArrayList<>();
		cus=cusService.getCustomers();
		return cus;
	}
	
	@GetMapping("/customers/{id}")
	private Customer getCustomerById(@PathVariable int id){
		//System.out.println("sasa");
		Customer cus=new Customer();
		cus=cusService.getCustomer(id);
		if(cus!=null)
			return cus;
		else {
			throw new CustomerNotFoundException("invalid customer Id");
		}
	}
	
	@PostMapping("/customers")
	private Customer addCustomer(@RequestBody Customer cus) {
		cus.setId(0);
		System.out.println(cus);
		cusService.saveCustomer(cus);
		return cus;
	}
	
	@PutMapping("/customers")
	private Customer getCustomerById(@RequestBody Customer cus){
		cusService.saveCustomer(cus);
		return cus;
	}
	
	@DeleteMapping("/customers/{id}")
	private String deleteCustomer(@PathVariable int id) {
		Customer cus=cusService.getCustomer(id);
		if(cus==null) {
			throw new CustomerNotFoundException("customer does not exist");
		}
		else {
			cusService.deleteCustomer(id);
			return "customer deleted successfully";
		}
	}
	
	
}
