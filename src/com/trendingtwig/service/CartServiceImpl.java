package com.trendingtwig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trendingtwig.dao.CartDao;
import com.trendingtwig.model.Cart;
import com.trendingtwig.model.Item;

@Service
public class CartServiceImpl implements CartService {

	private final CartDao cartDao;
	
	@Autowired
	public CartServiceImpl(CartDao cartDao) {
		this.cartDao = cartDao;
	}

	@Override
	public Cart getCart(Long id) {
		return cartDao.getCart(id);
	}

	@Override
	public void saveCart(Cart cart) {
	cartDao.saveCart(cart);
		
	}
	
	@Override
	public List<Item> getItemsInCart() {
		return cartDao.getItemsInCart();
	}

	@Override
	public void saveItemInCart(Item item) {
		cartDao.saveItemInCart(item);
	}

	@Override
	public void deleteItemInCart(Long id) {
		cartDao.deleteItemInCart(id);

	}

	@Override
	public void updateItemInCart(Item item) {
		cartDao.updateItemInCart(item);

	}

	

}
