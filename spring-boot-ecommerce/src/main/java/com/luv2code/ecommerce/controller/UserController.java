package com.luv2code.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.ecommerce.dao.UserRepository;
import com.luv2code.ecommerce.entity.UserDao;

@RestController
@CrossOrigin()
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
    public Long getUser(@RequestBody String email) {
        UserDao userDao= userRepository.findByEmail(email);
        if(userDao!=null) {
        	System.out.println(userDao.getId());
        	return userDao.getId();
        }
		return (long) 2;
		
		
        
        
    }

}
