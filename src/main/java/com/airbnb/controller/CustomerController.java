package com.airbnb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.airbnb.entity.Customer;
import com.airbnb.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerServ;
	
	//Save Customer
	@RequestMapping("/savecust")
	public String savecust(Customer cust) {
		
		customerServ.saveCustomerData(cust);
		return "show";
	}
	
	//list all customers
	@RequestMapping("/listallcust")
	public String listAllData(Customer cust,ModelMap model) {
		List<Customer> alldata = customerServ.listAllCustData(cust);
		model.addAttribute("alldata", alldata);
		return "list_allcust";
	}
	
	
	//delete
	@RequestMapping("/delete")
	public String delete(@RequestParam("id")long id,ModelMap model, Customer cust) {
		customerServ.deleteOneCust(id);
		
		List<Customer> alldata = customerServ.listAllCustData(cust);
		model.addAttribute("alldata", alldata);
		return "list_allcust";
	}
	
	
	@RequestMapping("/update")
	public String update(@RequestParam("id")long id,ModelMap model, Customer cust) {
		Customer updateOneCust = customerServ.updateOneCust(id);
		model.addAttribute("updateOneCust", updateOneCust);
		return "update_pass";
	}
	
	@RequestMapping("/updatecust")
	public String updatecust(Customer cust ,ModelMap model) {
		customerServ.updateOneCustInfo(cust);
		
		List<Customer> alldata = customerServ.listAllCustData(cust);
		model.addAttribute("alldata", alldata);
		return "list_allcust";
	}
	
}
