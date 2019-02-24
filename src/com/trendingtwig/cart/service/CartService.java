package com.trendingtwig.cart.service;

import java.util.List;

import com.trendingtwig.cart.model.Cart;
import com.trendingtwig.model.Item;

public interface CartService {

	public Cart getCart(Long id);

	public List<Item> getItemsInCart();

	public void saveItemInCart(Item item);

	public void deleteItemInCart(Long id);

	public void updateItemInCart(Item item);
}
