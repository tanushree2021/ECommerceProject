package com.trendingtwig.cart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trendingtwig.cart.model.Cart;
import com.trendingtwig.model.Item;

@Repository
public class CartDaoImpl implements CartDao {

	private final SessionFactory sessionFactory;
	
	@Autowired
	public CartDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public Cart getCart(Long id) {
		Cart cart = sessionFactory.openSession().get(Cart.class, id);
		if(cart == null) {
			throw new RuntimeException("Cart Not Found!!!");
		}
		return cart;  
	}

	@Transactional
	public List<Item> getItemsInCart() {
		return sessionFactory.openSession().createQuery("from Cart").getResultList();
	}

	@Transactional
	public void saveItemInCart(Item item) {
		sessionFactory.openSession().save(item);

	}

	@Transactional
	public void deleteItemInCart(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Item item = session.get(Item.class, id);
		session.delete(item);

	}

	@Override
	@Transactional
	public void updateItemInCart(Item item) {
		sessionFactory.getCurrentSession().saveOrUpdate(item);

	}

}
