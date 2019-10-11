package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * OederException
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 15:35
 * Modified by:
 */
public class OrderException extends RuntimeException {
	
	private Integer code;
	
	public OrderException(Integer code, String message){
		super(message);
		this.code = code;
	}

	public OrderException(ResultEnum resultEnum){
		super(resultEnum.getMessage());
		this.code = resultEnum.getCode();
	}
}
