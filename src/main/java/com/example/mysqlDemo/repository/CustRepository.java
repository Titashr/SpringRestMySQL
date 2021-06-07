package com.example.mysqlDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysqlDemo.model.Customer;

public interface CustRepository extends JpaRepository<Customer, Long>{

}
