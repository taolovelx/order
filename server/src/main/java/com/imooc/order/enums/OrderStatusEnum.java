package com.imooc.order.enums;

import lombok.Getter;

/**
 * OrderStatusEnum
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 11:39
 * Modified by:
 */
@Getter
public enum OrderStatusEnum {
	NEW(0, "新订单"),
	FINISHED(1, "完结"),
	CANCEL(2, "取消"),
	;
	private Integer code;

	private String message;

	OrderStatusEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
}
