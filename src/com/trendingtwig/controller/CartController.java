package com.trendingtwig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
		super();
		this.cartService = cartService;
	}

	@GetMapping(value = "/cart")
	public Cart getCart(Long id) {
		return cartService.getCart(id);
	}

	@GetMapping(value = "/savedCart")
	public void saveCart(Cart cart) {
		cartService.saveCart(cart);
	}
	
	@GetMapping(value = "/cart-items")
	public List<Item> getItemsInCart() {
		return cartService.getItemsInCart();
	}

	@PostMapping(value = "/item-saved-in-cart")
	public void saveItemInCart(@RequestBody Item item) {
		cartService.saveItemInCart(item);
	}

	@DeleteMapping("/cart-removed")
	public void deleteItemInCart(Long id) {
		cartService.deleteItemInCart(id);
	}

	@PutMapping("/")
	public void updateItemInCart(Item item) {
		cartService.updateItemInCart(item);
	}

}
