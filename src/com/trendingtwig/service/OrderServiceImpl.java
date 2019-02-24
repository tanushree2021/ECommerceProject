package com.trendingtwig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trendingtwig.dao.OrderDao;
import com.trendingtwig.model.Order;

@Service
public class OrderServiceImpl implements OrderService {

	private final OrderDao orderDao;
	
	@Autowired
	public OrderServiceImpl(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	@Override
	public Long placeOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order reviewOrder(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updateOrder(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelOrder(Long id) {
		// TODO Auto-generated method stub

	}

}
