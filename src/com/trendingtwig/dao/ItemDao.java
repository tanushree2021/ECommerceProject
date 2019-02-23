package com.trendingtwig.dao;

import java.util.List;

import com.trendingtwig.model.Item;

public interface ItemDao {

	public Item getItem(Long id);

	public List<Item> getItems();

	public void saveItem(Item item);

	public void deleteItem(Long id);

	public void updateItem(Item item);

}
