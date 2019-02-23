package com.trendingtwig.service;

import java.util.List;

import com.trendingtwig.model.Item;

public interface ItemService {

	public Item getItem(Long id);

	public List<Item> getItems();

	public void saveItem(Item item);

	public void deleteItem(Long id);

	public void updateItem(Item item);

}
