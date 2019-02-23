package com.trendingtwig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trendingtwig.model.Item;
import com.trendingtwig.service.ItemService;

@Controller
@RequestMapping(value = "/items")
public class ItemController {

	private final ItemService itemService;

	@Autowired
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping(value = "/{id}")
	public Item getItem(@PathVariable Long id) {
		return itemService.getItem(id);
	}

	@GetMapping(value = "/")
	public List<Item> getItems() {
		return itemService.getItems();
	}

	@PostMapping(value = "/")
	public void saveItem(@RequestBody Item item) {
		itemService.saveItem(item);
	}

	public void deleteItem(Long id) {
		itemService.deleteItem(id);
	}

	public void updateItem(Item item) {
		itemService.updateItem(item);
	}
}
