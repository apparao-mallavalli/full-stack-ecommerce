package com.luv2code.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.luv2code.ecommerce.dao.CartRepository;
import com.luv2code.ecommerce.entity.Cart;

public class CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
public Cart save(Cart cart) {
		
		
		return cartRepository.save(cart);
	}

}
