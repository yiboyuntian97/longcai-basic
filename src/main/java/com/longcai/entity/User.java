package com.longcai.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	private Long id;// 编号
	private String username;// 用户名
	private String password;// 密码
}
