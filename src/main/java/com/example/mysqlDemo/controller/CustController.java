package com.example.mysqlDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysqlDemo.model.Customer;
import com.example.mysqlDemo.service.CustService;

@RestController
@RequestMapping(value="/customer")
public class CustController {
	@Autowired
	private CustService custService;

	@PostMapping(value="/createCustomer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer c) {
		return ResponseEntity.ok().body(custService.createCustomer(c));
	}

}
