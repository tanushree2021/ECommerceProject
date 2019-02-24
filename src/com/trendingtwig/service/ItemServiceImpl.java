package com.trendingtwig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trendingtwig.dao.ItemDao;
import com.trendingtwig.model.Item;

@Service
public class ItemServiceImpl implements ItemService {
	
	private final ItemDao itemDao;

	@Autowired
	public ItemServiceImpl(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	@Override
	public Item getItem(Long id) {
		return itemDao.getItem(id);
	}

	@Override
	public List<Item> getItems() {
		return itemDao.getItems();
	}

	@Override
	public void saveItem(Item item) {
		itemDao.saveItem(item);
	}

	@Override
	public void deleteItem(Long id) {
		itemDao.deleteItem(id);
	}

	@Override
	public void updateItem(Item item) {
		itemDao.updateItem(item);
	}

}
