package com.trendingtwig.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trendingtwig.model.Item;

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
		if(item == null) {
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

}
