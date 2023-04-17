package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int custid;
	private String custname;
	private double custprice;
	
	public Customer() {
		super();
	}
	
	public Customer(int custid, String custname, double custprice) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custprice = custprice;
	}

	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getCustprice() {
		return custprice;
	}
	public void setCustprice(double custprice) {
		this.custprice = custprice;
	}
	
	

}
