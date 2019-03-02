package com.trendingtwig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trendingtwig.model.Item;
import com.trendingtwig.service.ItemService;

@Controller
public class HomeController {

	private final ItemService itemSevice;

	@Autowired
	public HomeController(ItemService itemSevice) {
		this.itemSevice = itemSevice;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHomePage(Model model) {
		List<Item> items = itemSevice.getItems();
		model.addAttribute("items", items);
		return "index";
	}
}
