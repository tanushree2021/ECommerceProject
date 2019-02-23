package com.trendingtwig.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.trendingtwig.model.Item;
import com.trendingtwig.service.ItemService;

@Controller
public class ItemController {
	
	private final ItemService itemService;
	
	@Autowired
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	public Item getItem(Long id) {
		return itemService.getItem(id);
	}

	public List<Item> getItems() {
		return itemService.getItems();
	}

	public void saveItem(Item item) {
		itemService.saveItem(item);
	}

	public void deleteItem(Long id) {
		itemService.deleteItem(id);
	}

	public void updateItem(Item item) {
		itemService.updateItem(item);
	}
}
