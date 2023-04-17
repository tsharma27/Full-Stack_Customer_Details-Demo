package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Customer;

@Repository
public interface CustRepository extends JpaRepository<Customer,Integer>{

}
