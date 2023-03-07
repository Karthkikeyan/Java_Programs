package com.te.bootwithstream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.bootwithstream.entity.Customer;
import com.te.bootwithstream.repository.CustomerDAO;
@Service
public class CustomerServiceImpl  implements CustomerService{

	@Autowired
	private CustomerDAO cdao;
	
	@Override
	public Customer addCustomer(Customer customer) {
		
		return cdao.save(customer);
	}

}
