package com.airbnb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airbnb.entity.Customer;
import com.airbnb.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepo;
	
	@Override
	public void saveCustomerData(Customer cust) {
		
		customerRepo.save(cust);
	}

	@Override
	public List<Customer> listAllCustData(Customer cust) {
		List<Customer> customerDetails = customerRepo.findAll();
		return customerDetails;
	}

	@Override
	public void deleteOneCust(long id) {
		
		customerRepo.deleteById(id);
		
	}

	@Override
	public Customer updateOneCust(long id) {
		Optional<Customer> oneCust = customerRepo.findById(id);
		Customer customer = oneCust.get();
		
		return customer;
	}

	@Override
	public void updateOneCustInfo(Customer cust) {
		customerRepo.save(cust);
		
	}

	
	

}
