package com.imooc.order.contorller;

import com.imooc.order.dataobject.ProductInfo;
import com.imooc.order.dto.CartDTO;
import com.imooc.product.client.ProductClient;
import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * ClientCintriller
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-07 14:22
 * Modified by:
 */
@RestController
@Slf4j
public class ClientCintroller {
	
	@Autowired
	private ProductClient productClient;

	//@GetMapping("getProductMsg")
	//public String getProductMsg() {
	//
	//	//feign
	//	String productMsg = productClient.productMsg();
	//	log.info("response={}", productMsg);
	//
	//	return productMsg;
	//}

	@GetMapping("/getProductList")
	public String getProductList() {
		List<ProductInfoOutput> productInfoList = productClient.listForOrder(Arrays.asList("164103465734242707"));
		log.info("response={}", productInfoList);
		return "ok";
	}
	@GetMapping("/productDecreaseStock")
	public String productDecreaseStock(){
		productClient.decreaseStock(Arrays.asList(new DecreaseStockInput("164103465734242707",3)));
		return "ok";
	}
	
}
