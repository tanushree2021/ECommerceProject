package com.trendingtwig.service;

import com.trendingtwig.model.Order;

public interface OrderService {

	public Long placeOrder();
	
	public Order reviewOrder(Long id);
	
	public Long	updateOrder(Long id);
	
	public void cancelOrder(Long id);
	
}
