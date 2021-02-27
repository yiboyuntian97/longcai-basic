package com.longcai.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Object myExceptionHandler(Exception e) {
		e.printStackTrace();
		return "您访问的页面正忙，请刷新或稍后访问";
	}
	
}
