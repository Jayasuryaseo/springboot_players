package com.Project.SpringApp.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Table(name= "customer")
public class Customer {
	
	@Id
	@Column( name= "Customer_id", length=50 )
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custid;
	
	@Column( name= "Customer_name", length=50 )
	private String custname;
	
	@Column( name= "Customer_address", length=50 )
	private String custaddress;
	
	@Column( name= "mobile", length=50 )
	private int mobile;
	
	
	public Customer(int custid, String custname, int mobile) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.mobile = mobile;
	}


	public Customer() {
		
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


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", mobile=" + mobile + "]";
	}
	
	
	
	
}
