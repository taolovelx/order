package com.imooc.product.emums;

import lombok.Getter;

/**
 * 商品上下架状态
 * ProductStatusEnum
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 0:32
 * Modified by:
 */
@Getter
public enum ProductStatusEnum {
	UP(0, "在架"),
	DOWN(1, "下架"),
	;

	private Integer code;

	private String message;

	ProductStatusEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	
}
