package com.trendingtwig.service;

import java.math.BigInteger;
import java.util.List;

import com.trendingtwig.model.Customer;

public interface CustomerService {
	
		public Customer getCustomer(BigInteger custId);
		
		public List<Object> customerCart();
		
		public List<Object> customerWishList();
		
		public List<Object> customerOrder();
		
		public void saveCustomer(Customer customer);
		
		public void updateCustomer(Customer customer);
		
		public void deleteCustomer(BigInteger custId);
		 
}
