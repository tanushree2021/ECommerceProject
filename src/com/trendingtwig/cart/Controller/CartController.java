package com.trendingtwig.cart.Controller;

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

import com.trendingtwig.cart.model.Cart;
import com.trendingtwig.cart.service.CartService;
import com.trendingtwig.model.Item;

@Controller
@RequestMapping(value="/cart")
public class CartController {

	private final CartService cartService;

	@Autowired
	public CartController(CartService cartService) {
		super();
		this.cartService = cartService;
	}
	
	@GetMapping(value = "/{id}")
	public Cart getcart(@PathVariable Long id) {
		return cartService.getCart(id);
	}

	@GetMapping(value = "/")
	public List<Item> getItemsInCart() {
		return cartService.getItemsInCart();
	}

	@PostMapping(value = "/")
	public void saveItemInCart(@RequestBody Item item) {
		cartService.saveItemInCart(item);
	}

	@DeleteMapping("/{id}")
	public void deleteItemInCart(@PathVariable("id") Long id) {
		cartService.deleteItemInCart(id);
	}

	@PutMapping("/")
	public void updateItemInCart(Item item) {
		cartService.updateItemInCart(item);
	}

}
