package com.niit.shopgorgeous.dao;

import com.niit.shopgorgeous.model.Cart;
import com.niit.shopgorgeous.model.CartItem;

public interface CartItemDAO {

	void addCartItem(CartItem cartItem);
	void removeCartItem(int cartitemid);
	void removeAllCartItems(Cart cart);
}
