package com.example.mysqlDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysqlDemo.model.Customer;
import com.example.mysqlDemo.repository.CustRepository;

@Service
public class CustServiceImpl implements CustService{

	@Autowired
	private CustRepository custRepo;
	
	@Override
	public Customer createCustomer(Customer c) {
		
		return custRepo.save(c);
	}

}
