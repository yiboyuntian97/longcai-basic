package com.longcai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.longcai.dao.UserMapper;
import com.longcai.entity.Permission;
import com.longcai.entity.User;

@Component
public class MemberUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//1.根据该用户名称查询在数据库中是否存在
		User user = userMapper.findByUserName(username);
		if(user == null) {
			return null;
		}
		
		//2.需要联表查询用户名称对应的权限
		List<Permission> permissionList = userMapper.findPermissionByUsername(username);
		permissionList.forEach((p) -> {
			p.getGetPermTag();
		});
		//3.将该权限添加到security
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String args) {
		UserDetailsService userDetailsService = (username) -> {
			return null;
		};
	}

}
