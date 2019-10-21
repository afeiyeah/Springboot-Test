package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.test.model.bean.User;
import com.example.test.model.service.UserService;

@Controller
public class UserController2 {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="addUser",method={RequestMethod.GET,RequestMethod.POST})
	public String addUser(User u){
		userService.addUser(u);
		return "addUser.html";
	}
}
