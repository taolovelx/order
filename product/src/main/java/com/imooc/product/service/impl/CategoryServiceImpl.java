package com.imooc.product.service.impl;

import com.imooc.product.dataobject.ProductCategory;
import com.imooc.product.repository.ProductCategoryRepository;
import com.imooc.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CategoryServiceImpl
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 1:22
 * Modified by:
 */
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
		return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
	}
}
