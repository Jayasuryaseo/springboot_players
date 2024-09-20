package com.Project.SpringApp.CustomerControler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.SpringApp.DTO.CustomerDTO;
import com.Project.SpringApp.DTO.CustomerSaveDTO;
import com.Project.SpringApp.service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerControler {
	
	
	@Autowired
	private CustomerService customerservice;
	
	
	@PostMapping(path= "/save")
	public String savecustomer(@RequestBody CustomerSaveDTO customersaveDTO) {
		
		String id= customerservice.addCustomer(customersaveDTO);
		return id;
}
}