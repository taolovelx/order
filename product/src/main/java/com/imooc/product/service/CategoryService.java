package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * CategoryService
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 1:21
 * Modified by:
 */
public interface CategoryService {
	
	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
