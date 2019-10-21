package com.example.test.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.test.model.bean.User;
import com.example.test.model.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Transactional
	public void addUser(User u){
		userMapper.addUser(u);
	}
	
	public List<User> selectUsers(int pageSize, int pageNum){
		Map<String,Object> map=new HashMap<>();
		map.put("k_index", pageSize*(pageNum-1));
		map.put("k_pageSize", pageSize);
		return userMapper.selectUsers(map);
	}
	
	@Transactional
	public void deleteUser(int uid){
		userMapper.deleteUser(uid);
	}
	public User getUSerById(int uid){
		return userMapper.getUSerById(uid);
		
	}
	@Transactional
	public void updateUser(User u){
		userMapper.updateUser(u);
	}
}
