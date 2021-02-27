package com.longcai.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longcai.dao.UserMapper;
import com.longcai.entity.User;
import com.longcai.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	@Override
	public void insertUser(User user) {

		userMapper.insertUser(user);

	}

}
