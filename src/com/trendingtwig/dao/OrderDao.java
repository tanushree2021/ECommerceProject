package com.trendingtwig.dao;

import com.trendingtwig.model.Order;

public interface OrderDao {

	public Long placeOrder();
	
	public Order reviewOrder(Long id);
	
	public Long	updateOrder(Long id);
	
	public void cancelOrder(Long id);
	
}
