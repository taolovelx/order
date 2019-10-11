package com.imooc.product.repository;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * ProductCategoryRepositoryTest
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-05 23:51
 * Modified by:
 */
public class ProductCategoryRepositoryTest extends ProductApplicationTests {
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	@Test
	public void findByCategoryTypeIn() {
		List<ProductCategory> byCategoryTypeIn = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11, 12));
		Assert.assertTrue(byCategoryTypeIn.size() > 0);
	}
}