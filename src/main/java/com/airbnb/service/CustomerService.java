package com.airbnb.service;

import java.util.List;

import com.airbnb.entity.Customer;

public interface CustomerService {
	
		public void saveCustomerData(Customer cust);

		public List<Customer> listAllCustData(Customer cust);

		public void deleteOneCust(long id);

		public Customer updateOneCust(long id);

		public void updateOneCustInfo(Customer cust);
}
