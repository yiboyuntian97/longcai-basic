package com.longcai.util;

import com.longcai.vo.ResultVO;

/**
 * 封装返回前端信息类
 * @author Administrator
 *
 */
public class ResultVOUtil {
	
	public static ResultVO success(Object obj) {
		ResultVO resultVO = new ResultVO<>();
		
		resultVO.setCode(0);
		
		resultVO.setData(obj);
		
		resultVO.setMessage("成功");
		
		return resultVO;
		
	}
	
	public static ResultVO success() {
		ResultVO resultVO = new ResultVO<>();
		
		resultVO.setCode(0);
		resultVO.setData(null);
		resultVO.setMessage("成功");
		return resultVO;
	}
	
	public static ResultVO error(Integer code,String message) {
		ResultVO resultVO = new ResultVO<>();
		resultVO.setCode(code);
		resultVO.setMessage(message);
		return resultVO;
	}

}
