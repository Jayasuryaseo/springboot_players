package com.Project.SpringApp.DTO;

public class CustomerSaveDTO {
	
	private int custid;
	private String custname;
	private String custaddress;
	private int mobile;
	
	
	public CustomerSaveDTO(String custname, String custaddress, int mobile) {
		super();
		
		this.custname = custname;
		this.custaddress = custaddress;
		this.mobile = mobile;
	}


	public CustomerSaveDTO() {
		
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
		return "CustomerDTO [custname=" + custname + ", custaddress=" + custaddress + ", mobile="
				+ mobile + "]";
	}

}
