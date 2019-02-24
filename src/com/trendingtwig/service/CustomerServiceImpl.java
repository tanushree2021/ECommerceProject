package com.trendingtwig.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trendingtwig.dao.CustomerDao;
import com.trendingtwig.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	private final CustomerDao customerDao;

	@Autowired
	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	public Customer getCustomer(BigInteger custId)
	{
		return customerDao.getCustomer(custId);
	}
	
	@Override
	public List<Object> customerCart()
	{
		return customerDao.customerCart();
	}
	
	@Override
	public List<Object> customerWishList()
	{
		return customerDao.customerWishList();
	}
	
	@Override
	public List<Object> customerOrder()
	{
		return customerDao.customerOrder();
	}
	
	@Override
	public void saveCustomer(Customer customer)
	{
		 customerDao.saveCustomer(customer);
	}
	
	@Override
	public void updateCustomer(Customer customer)
	{
		customerDao.updateCustomer(customer);
	}
	
	@Override
	public void deleteCustomer(BigInteger custId)
	{
		customerDao.deleteCustomer(custId);
	}
}
