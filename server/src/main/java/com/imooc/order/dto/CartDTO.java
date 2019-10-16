package com.imooc.order.dto;

import lombok.Data;

/**
 * CartDTO
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-12 23:08
 * Modified by:
 */
@Data
public class CartDTO {

	/** 商品id. */
	private String productId;
	
	/** 商品数量. */
	private Integer productQuantity;

	public CartDTO(String productId, Integer productQuantity) {
		this.productId = productId;
		this.productQuantity = productQuantity;
	}

	public CartDTO() {
	}
}
