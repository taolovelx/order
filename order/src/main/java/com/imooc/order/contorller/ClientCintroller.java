package com.imooc.order.contorller;

import com.imooc.order.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping("getProductMsg")
	public String getProductMsg() {

		//feign
		String productMsg = productClient.productMsg();
		log.info("response={}", productMsg);
		return productMsg;
	}
}
