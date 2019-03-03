package com.trendingtwig.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trendingtwig.model.Cart;
import com.trendingtwig.model.Item;

@Repository
public class CartDaoImpl implements CartDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public CartDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public Cart getCart(Long id) {
		Cart cart = sessionFactory.openSession().get(Cart.class, id);
		if (cart == null) {
			throw new RuntimeException("Cart Not Found!!!");
		}
		return cart;
	}

	@Override
	@Transactional
	public void saveCart(Cart cart) {
		sessionFactory.openSession().save(cart);
	}

	@Override
	@Transactional
	public List<Item> getItemsInCart() {
		return sessionFactory.openSession().createQuery("from Cart").getResultList();
	}

	

	@Override
	@Transactional
	public void saveItemInCart(Item item) {
		sessionFactory.openSession().save(item);
		/*int temp = 0;
		List<Item> items = sessionFactory.openSession().createQuery("from Item").getResultList();
		System.out.println(items);
		System.out.println("----------------------");
		for (Item itemlist : items) {
			temp++;
		}*/
	}

	@Override
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

	@PostConstruct
	@Transactional
	public void initialDataInCart() {
		
		Cart cart1= new Cart("No items in cart..");
		Cart cart2= new Cart("2 items in cart..");
		Cart cart3= new Cart("4 items in cart..");
		
		saveCart(cart1);
		saveCart(cart2);
		saveCart(cart3);
	
		/*List<Item> items = sessionFactory.openSession().createQuery("from Item").getResultList();
		int i=items.size(); 
		Cart carttemp=null;
		if(i == 0)
			carttemp = new Cart("No Items in Cart");
		else if (i>0)
			carttemp = new Cart(i +" Item/s in Cart");
		
		saveCart(carttemp);
			*/
	}
}
