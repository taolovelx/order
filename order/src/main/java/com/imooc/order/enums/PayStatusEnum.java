package com.imooc.order.enums;

import lombok.Getter;

/**
 * PayStatusEnum
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 11:39
 * Modified by:
 */
@Getter
public enum PayStatusEnum {
	WAIT(0, "等待支付"),
	SUCCESS(1, "支付成功"),
	;
	private Integer code;

	private String message;

	PayStatusEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
}
