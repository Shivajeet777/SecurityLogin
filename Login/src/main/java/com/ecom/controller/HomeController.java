package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.model.UserDtls;
import com.ecom.service.UserService;

@Controller
public class HomeController 
{
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
   public String home()
   {
	return "base";
	   
   }
	
	@GetMapping("/signin")
	   public String login()
	   {
		return "login";
		   
	   }
	
	@GetMapping("/register")
	   public String register()
	   {
		return "register";
		   
	   }
	  
	   @PostMapping("/saveUser")
	   public String saveUser(@ModelAttribute UserDtls user)
	   {
		   userService.saveUser(user);
		   return "login";
		   
	   }
}




