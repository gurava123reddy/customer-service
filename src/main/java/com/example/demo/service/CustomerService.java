package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Customer;

public interface CustomerService {

	public ResponseEntity<Customer> saveCustomer(Customer customer);

	public List<Customer> getAllCustomers();

}
