package com.longcai.enums;

/**
 * 封装返回结果枚举类
 * @author Administrator
 *
 */
public enum ResultEnum {

	SUCCESS(0, "成功"),

	ERROR(1, "错误"),

	PARAM_ERROR(2, "参数不正确"),;

	private Integer code;

	private String message;

	ResultEnum(Integer code, String message) {
		// TODO Auto-generated constructor stub
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
