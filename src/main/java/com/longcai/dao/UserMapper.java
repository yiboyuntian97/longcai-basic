package com.longcai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.longcai.entity.User;

@Mapper
public interface UserMapper {
	List<User> findAll();
	
	void insertUser(User user);
}
