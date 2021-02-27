package com.longcai.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@ApiModel("用户实体")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
	@ApiModelProperty("编号")
	private int id;// 编号
	private String userName;// 用户名
	private String password;// 密码
}
