package com.imooc.product.service;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

/**
 * ProductServiceTest
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 0:59
 * Modified by:
 */
@Component
public class ProductServiceTest extends ProductApplicationTests {
	
	
	@Autowired
	private ProductService productService;
	
	@Test
	public void findUpAll() {
		List<ProductInfo> upAll = productService.findUpAll();
		Assert.assertTrue(upAll.size() > 0);
	}
}