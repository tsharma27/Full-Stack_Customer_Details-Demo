package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Customer;
import com.demo.repository.CustRepository;

import antlr.collections.List;
import java.util.*;  

@RestController //REpresentational State Transfer Controller - RESTController.
@CrossOrigin(origins="http://localhost:4200")
public class CustController {
	
	@Autowired
	private CustRepository crepository;
	
	@CrossOrigin(origins="http://localhost:4200")	
	@PostMapping("/insertrecord")
	public Customer insertcustdata(@RequestBody Customer c1){
		
		return this.crepository.save(c1);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/updaterecord")
	public Customer updatecustdata(@RequestBody Customer c1){
		
		return this.crepository.save(c1);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/deleterecord")
	public void deletecustdata(@RequestBody Customer c1){
		
		crepository.delete(c1);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/viewrecord")
	public java.util.List<Customer> viewrecord()
	{
		return crepository.findAll();
	}
	

}
