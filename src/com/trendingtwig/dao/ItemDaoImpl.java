package com.trendingtwig.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trendingtwig.model.Item;
import com.trendingtwig.model.ItemDetail;

@Repository
public class ItemDaoImpl implements ItemDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public ItemDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public Item getItem(Long id) {
		Item item = sessionFactory.openSession().get(Item.class, id);
		if (item == null) {
			throw new RuntimeException("Item Not Found!!!");
		}
		return item;
	}

	@Override
	@Transactional
	public List<Item> getItems() {
		return sessionFactory.openSession().createQuery("from Item").getResultList();
	}

	@Override
	@Transactional
	public void saveItem(Item item) {
		sessionFactory.openSession().save(item);
	}

	@Override
	@Transactional
	public void deleteItem(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Item item = session.get(Item.class, id);
		session.delete(item);
	}

	@Override
	@Transactional
	public void updateItem(Item item) {
		sessionFactory.getCurrentSession().saveOrUpdate(item);
	}

	@PostConstruct
	public void initialData() {
		ItemDetail itemDetail1 = new ItemDetail("Brand", "M", "Black", "Coton");
		ItemDetail itemDetail2 = new ItemDetail("Brand", "M", "Black", "Coton");
		ItemDetail itemDetail3 = new ItemDetail("Brand", "M", "Black", "Coton");
		ItemDetail itemDetail4 = new ItemDetail("Brand", "M", "Black", "Coton");
		ItemDetail itemDetail5 = new ItemDetail("Brand", "M", "Black", "Coton");

		saveItem(new Item("Dress 1", "black Shirt", BigDecimal.TEN, "resources/img/product-img/product-1.jpg",
				new Integer(100), "Dress", "Fency Dress", itemDetail1));
		saveItem(new Item("Dress 2", "black Shirt", BigDecimal.TEN, "resources/img/product-img/product-2.jpg",
				new Integer(100), "Test", "Test 2", itemDetail2));
		saveItem(new Item("Dress 3", "black Shirt", BigDecimal.TEN, "resources/img/product-img/product-3.jpg",
				new Integer(100), "Test", "Test 2", itemDetail3));
		saveItem(new Item("Dress 4", "black Shirt", BigDecimal.TEN, "resources/img/product-img/product-4.jpg",
				new Integer(100), "Test", "Test 2", itemDetail4));
		saveItem(new Item("Dress 5", "black Shirt", BigDecimal.TEN, "resources/img/product-img/product-5.jpg",
				new Integer(100), "Test", "Test 2", itemDetail5));
	}
	}
