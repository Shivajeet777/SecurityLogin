package com.ecom.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecom.model.UserDtls;
import com.ecom.repository.UserRepository;
import com.ecom.service.UserService;


@Service
public class UserServiceImpl implements UserService
{
   
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private  PasswordEncoder passwordEncoder;
	
	
	@Override
	public UserDtls saveUser(UserDtls user) 
	{
		String encodePassword =passwordEncoder.encode(user.getPassword());
		user.setPassword(encodePassword);
		repo.save(user);
		return null;
	}

}
