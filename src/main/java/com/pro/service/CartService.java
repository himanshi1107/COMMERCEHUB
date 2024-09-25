package com.pro.service;

import com.pro.exception.ProductException;
import com.pro.model.Cart;
import com.pro.model.CartItem;
import com.pro.model.User;
import com.pro.request.AddItemRequest;

public interface CartService {

	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
