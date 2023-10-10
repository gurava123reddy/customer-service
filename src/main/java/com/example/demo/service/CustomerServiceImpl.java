package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public ResponseEntity<Customer> saveCustomer(Customer customer) {
		Customer saveCustomer = customerRepository.save(customer);
		return new ResponseEntity<>(saveCustomer, HttpStatus.OK);
	}
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

}
