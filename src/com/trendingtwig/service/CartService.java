package com.trendingtwig.service;

import java.util.List;

import com.trendingtwig.model.Cart;
import com.trendingtwig.model.Item;

public interface CartService {

	public Cart getCart(Long id);
	
	public void saveCart(Cart cart);

	public List<Item> getItemsInCart();

	public void saveItemInCart(Item item);

	public void deleteItemInCart(Long id);

	public void updateItemInCart(Item item);
}
