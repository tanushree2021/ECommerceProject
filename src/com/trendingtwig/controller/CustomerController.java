package com.trendingtwig.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trendingtwig.model.Customer;
import com.trendingtwig.service.CustomerService;

@Controller
@RequestMapping(value = "/customers")
public class CustomerController {
	private final CustomerService custService;

	@Autowired
	public CustomerController(CustomerService custService) {
		super();
		this.custService = custService;
	}
	
	@GetMapping(value = "/{custId}")
	public Customer getCustomer(@PathVariable BigInteger custId)
	{
		return custService.getCustomer(custId);
	}
	
	@GetMapping(value = "/")
	public List<Object> customerCart()
	{
		return custService.customerCart();
	}

	@GetMapping(value = "/")
	public List<Object> customerWishList()
	{
		return custService.customerWishList();
	}
	
	@GetMapping(value = "/")
	public List<Object> customerOrder()
	{
		return custService.customerOrder();
	}
	
	@PostMapping(value = "/")
	public void saveCustomer(@RequestBody Customer customer)
	{
		 custService.saveCustomer(customer);
	}
	
	public void updateCustomer(Customer customer)
	{
		custService.updateCustomer(customer);
	}
	
	public void deleteCustomer(BigInteger custId)
	{
		custService.deleteCustomer(custId);
	}
}
