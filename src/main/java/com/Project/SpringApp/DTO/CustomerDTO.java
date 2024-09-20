package com.Project.SpringApp.DTO;


public class CustomerDTO {
	private int custid;
	private String custname;
	private String custaddress;
	private int mobile;
	
	
	public CustomerDTO(int custid, String custname, String custaddress, int mobile) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custaddress = custaddress;
		this.mobile = mobile;
	}


	public CustomerDTO() {
		
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


	public String getCustaddress() {
		return custaddress;
	}


	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	@Override
	public String toString() {
		return "CustomerDTO [custid=" + custid + ", custname=" + custname + ", custaddress=" + custaddress + ", mobile="
				+ mobile + "]";
	}
	
	
	
	

}
