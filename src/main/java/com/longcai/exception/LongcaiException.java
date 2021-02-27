package com.longcai.exception;



import com.longcai.enums.ResultEnum;

import lombok.Getter;

@Getter
public class LongcaiException extends RuntimeException{
	
	private Integer code;
	
    public LongcaiException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public LongcaiException(Integer code,String message) {
        super(message);
        this.code = code;
    }
	

}
