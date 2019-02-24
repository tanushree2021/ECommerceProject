package com.trendingtwig.dao;

import java.math.BigInteger;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trendingtwig.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	private final SessionFactory sessionFactory;
	
	@Autowired
	public CustomerDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory=sessionFactory;
	}
	
	@Override
	@Transactional
	public Customer getCustomer(BigInteger custId)
	{
		Customer cust = sessionFactory.openSession().get(Customer.class, custId);
		if(cust==null)
			throw new RuntimeException("Customer not found!");
		return cust;
		
	}

	@Override
	@Transactional
	public List<Object> customerCart() {
		return sessionFactory.openSession().createQuery("from TWIG_CUSTOMER").getResultList();
	}

	@Override
	@Transactional
	public List<Object> customerWishList() {
		return sessionFactory.openSession().createQuery("from TWIG_CUSTOMER").getResultList();
	}

	@Override
	@Transactional
	public List<Object> customerOrder() {
		return sessionFactory.openSession().createQuery("from TWIG_CUSTOMER").getResultList();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		sessionFactory.openSession().save(customer);
		
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	@Override
	@Transactional
	public void deleteCustomer(BigInteger custId) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, custId);
		session.delete(customer);
		
	}
}
