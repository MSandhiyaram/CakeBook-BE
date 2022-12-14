package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;
//import com.example.model.User;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
}