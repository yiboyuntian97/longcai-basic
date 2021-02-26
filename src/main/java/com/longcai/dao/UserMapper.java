package com.longcai.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import com.longcai.entity.User;

@Mapper
public interface UserMapper {
	List<User> findAll();
}
