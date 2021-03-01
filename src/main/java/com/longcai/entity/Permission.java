package com.longcai.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Permission {
	
	@ApiModelProperty("权限标签")
	private String getPermTag;

}
