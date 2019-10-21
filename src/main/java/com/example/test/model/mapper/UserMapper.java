package com.example.test.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.test.model.bean.User;

@Mapper
public interface UserMapper {
	@Insert("insert into user(uid,uname,age) values(#{uid},#{uname},#{age})")
	public void addUser(User u);
	
	@Select("select * from user limit #{k_index},#{k_pageSize}")
	public List<User> selectUsers(Map<String,Object> map);
	
	@Delete("delete from user where uid=#{uid}")
	public void deleteUser(int u);
	
	@Select("select * from user where uid=#{uid}")
	public User getUSerById(int uid);
	
	@Update("update user set uname=#{uname},age=#{age} where uid=#{uid}")
	public void updateUser(User u);
}
