package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * ProductService
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 0:26
 * Modified by:
 */
public interface ProductService {
	/**
	 * 查询所有在加商品列表
	 */
	List<ProductInfo> findUpAll();
}
