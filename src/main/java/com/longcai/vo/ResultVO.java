package com.longcai.vo;

import java.io.Serializable;

import lombok.Data;
/**
 * 返回前端信息类实体
 * @author Administrator
 *
 * @param <T>
 */
@Data
public class ResultVO<T> implements Serializable {
	
	/**
	 * 错误码
	 */
	public Integer code;
	
	/**
	 * 错误信息
	 */
	public String message;
	
	/**
	 * 具体内容
	 */
	public T data;

}
