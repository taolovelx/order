package com.imooc.order.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * ProductClient
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-11 12:41
 * Modified by:
 */
@FeignClient(name = "product")
public interface ProductClient {

	@GetMapping("/msg")
	String productMsg();

}
