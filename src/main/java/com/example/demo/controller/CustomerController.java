package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@PostMapping("/customer-service")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		ResponseEntity<Customer> saveCustomer =  customerService.saveCustomer(customer);
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}
	
	@GetMapping("/customer-service")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	

}
