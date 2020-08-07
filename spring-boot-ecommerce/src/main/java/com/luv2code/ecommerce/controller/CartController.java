package com.luv2code.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luv2code.ecommerce.entity.Cart;
import com.luv2code.ecommerce.service.CartService;

public class CartController {
	@Autowired 
	private CartService cartService;
	
	
@RequestMapping(value = "/cart", method = RequestMethod.POST)
	
	public ResponseEntity<?> saveUser(@RequestBody Cart cart) throws Exception {
		
		return ResponseEntity.ok(cartService.save(cart));
	}
	
	
}
