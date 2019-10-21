package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.bean.User;
import com.example.test.model.service.UserService;

@RestController
public class UserNewController {
	@Autowired
	private UserService userService;
	
	/*
	 * @Controller+@ResponseBody注解处理ajax请求
	 * @RestController=@Controller+@ResponseBody
	 * 
	 * @RequestMapping("路径")
	 * @GetMapping
	 * @PostMapping
	 */
	@RequestMapping("selectUser/{pageSize}/{pageNum}")
	public List<User> selectUsers(@PathVariable int pageSize,@PathVariable int pageNum){
		return userService.selectUsers(pageSize,pageNum);
	}
	@RequestMapping("deleteUser/{uid}")
	public String deleteUserById(@PathVariable int uid){
		userService.deleteUser(uid);
		return "{\"result\":\"成功\"}";
	}
	
	@RequestMapping("getUserById")
	public User getUSerById(int uid){
		return userService.getUSerById(uid);
		
	}
	@RequestMapping("updateUser")
	public String updateUser(User u){
		
		userService.updateUser(u);
		return "{\"result\":\"修改成功\"}";
		
	}
	
}
