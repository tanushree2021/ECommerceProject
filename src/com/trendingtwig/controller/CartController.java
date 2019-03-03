package com.trendingtwig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trendingtwig.model.Cart;
import com.trendingtwig.service.CartService;
import com.trendingtwig.model.Item;

@Controller
@RequestMapping(value = "/carts")
public class CartController {

	private final CartService cartService;

	@Autowired
	public CartController(CartService cartService) {
		this.cartService = cartService;
	}

	@GetMapping(value = "/{id}")
	public Cart getCart(@PathVariable Long id) {
		return cartService.getCart(id);
	}

	@PostMapping(value = "/")
	public void saveCart(@ModelAttribute("cart") Cart cart) {
		cartService.saveCart(cart);
	}

	@GetMapping(value = "/all")
	public List<Item> getCarts() {
		return cartService.getItemsInCart();
	}

	@PostMapping(value = "/update")
	public void saveItemInCart(@ModelAttribute("item") Item item) {
		cartService.saveItemInCart(item);
	}

	@PostMapping("/{id}/delete")
	public void deleteItemInCart(@PathVariable("id") Long id) {
		cartService.deleteItemInCart(id);
	}
}
