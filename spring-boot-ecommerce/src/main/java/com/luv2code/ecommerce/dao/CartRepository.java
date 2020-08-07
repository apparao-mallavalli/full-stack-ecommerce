package com.luv2code.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.luv2code.ecommerce.entity.Cart;

@CrossOrigin("http://localhost:4200")

	public interface CartRepository extends JpaRepository<Cart, Long> {
		
	//public List<Cart> findByProductId(@RequestParam("id") Long id);
	
	}


