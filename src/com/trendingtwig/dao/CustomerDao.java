package com.trendingtwig.dao;

import java.math.BigInteger;
import java.util.List;

import com.trendingtwig.model.Customer;

public interface CustomerDao {
	public Customer getCustomer(BigInteger custId);
	
	public List<Object> customerCart();
	
	public List<Object> customerWishList();
	
	public List<Object> customerOrder();
	
	public void saveCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(BigInteger custId);
	 
}
