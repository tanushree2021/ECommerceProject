package com.trendingtwig.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trendingtwig.model.Order;

@Repository
public class OrderDaoImpl implements OrderDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public OrderDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
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
