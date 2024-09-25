package com.pro.service;

import org.springframework.stereotype.Service;

import com.pro.exception.ProductException;
import com.pro.model.Cart;
import com.pro.model.CartItem;
import com.pro.model.Product;
import com.pro.model.User;
import com.pro.repository.CartRepository;
import com.pro.request.AddItemRequest;

import jakarta.transaction.Transactional;

@Service
public class CartServiceImplementation implements CartService {

	private CartRepository cartRepository;
	private CartItemService cartItemService;
	private ProductService productService;

	public CartServiceImplementation(CartRepository cartRepository, CartItemService cartItemService,
			ProductService productService) {
		super();
		this.cartRepository = cartRepository;
		this.cartItemService = cartItemService;
		this.productService = productService;
	}

	@Override
	@Transactional
	public Cart createCart(User user) {
		Cart cart = new Cart();
		cart.setUser(user);
		// Cart createdCart = cartRepository.save(cart);
		// return createdCart;
		return cartRepository.save(cart);
	}

	@Override
	@Transactional
	public CartItem addCartItem(Long userId, AddItemRequest req) throws ProductException {
		Cart cart=cartRepository.findByUserId(userId);
		
		 if (cart == null) {
	            // handle case when cart is not found
	            throw new ProductException("Cart not found for user ID: " + userId);
	        
		 }
		 
		Product product=productService.findProductById(req.getProductId());
		
		CartItem isPresent=cartItemService.isCartItemExist(cart, product, req.getSize(),userId);
		
		if(isPresent == null) {
			CartItem cartItem = new CartItem();
			cartItem.setProduct(product);
			cartItem.setCart(cart);
			cartItem.setQuantity(req.getQuantity());
			cartItem.setUserId(userId);
			
			
			int price=req.getQuantity()*product.getDiscountedPrice();
			cartItem.setPrice(price);
			cartItem.setSize(req.getSize());
			
			CartItem createdCartItem=cartItemService.createCartItem(cartItem);
			cart.getCartItems().add(createdCartItem);
			return createdCartItem;
		}
		
		return isPresent;
	}

	@Override
	@Transactional
	public Cart findUserCart(Long userId) {
		Cart cart = cartRepository.findByUserId(userId);
		int totalPrice = 0;
		int totalDiscountPrice = 0;
		int totalItem = 0;
		for (CartItem cartsItem : cart.getCartItems()) {
			totalPrice += cartsItem.getPrice();
			totalDiscountPrice += cartsItem.getDiscountPrice();
			totalItem += cartsItem.getQuantity();
		}

		cart.setTotalPrice(totalPrice);
		cart.setTotalItem(cart.getCartItems().size());
		cart.setTotalDiscountPrice(totalDiscountPrice);
		cart.setDiscount(totalPrice - totalDiscountPrice);
		cart.setTotalItem(totalItem);

		return cartRepository.save(cart);

	}

}
