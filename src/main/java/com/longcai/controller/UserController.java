package com.longcai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.longcai.entity.User;
import com.longcai.service.UserService;
import com.longcai.util.ResultVOUtil;
import com.longcai.vo.ResultVO;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation("查询所有用户")
	@GetMapping("/findAll")
	public ResultVO<List<User>> findAll() {
		log.warn("查询出用户 {}",userService.findAll());
		return ResultVOUtil.success(userService.findAll());
	}
	
	@GetMapping("/insert")
	public void insertUser() {
		User user = new User();
		user.setUserName("www");
		user.setPassword("xxxx");
		userService.insertUser(user);
	}

}
