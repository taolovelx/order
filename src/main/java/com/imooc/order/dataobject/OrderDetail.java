package com.imooc.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * OrderDetail
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 11:28
 * Modified by:
 */
@Data
@Entity
public class OrderDetail {

	@Id
	private String detailId;

	/** 订单id. */
	private String orderId;

	/** 商品id. */
	private String productId;

	/** 商品名称. */
	private String productName;

	/** 商品单价. */
	private BigDecimal productPrice;

	/** 商品数量. */
	private Integer productQuantity;

	/** 商品小图. */
	private String productIcon;
}
