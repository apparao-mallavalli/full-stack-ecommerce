package com.luv2code.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.luv2code.ecommerce.dao.UserRepository;
import com.luv2code.ecommerce.entity.UserDao;
import com.luv2code.ecommerce.entity.UserDto;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserDao user = userDao.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				new ArrayList<>());
	}

	public UserDao save(UserDto user) {
		
		UserDao newUser = new UserDao();
		newUser.setUsername(user.getUsername());
		
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		
		newUser.setEmail(user.getEmail());
		return userDao.save(newUser);
	}
}