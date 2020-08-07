package com.luv2code.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.ecommerce.entity.UserDao;
public interface UserRepository extends JpaRepository<UserDao, Long> {
	
	
   UserDao findByUsername(String username);
  UserDao findByEmail(String email);
    
}