package com.imooc.order.contorller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
	private LoadBalancerClient loadBalancerClient;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("getProductMsg")
	public String getProductMsg() {
		RestTemplate restTemplate = new RestTemplate();
		ServiceInstance instance = loadBalancerClient.choose("PRODUCT");
		String url = String.format("http://%s:%s/msg", instance.getHost(), instance.getPort());
		String response = restTemplate.getForObject(url, String.class);
		return  response;
		
		//第三种方式
		//String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);
		//log.info("response={}", response);
		//return response;
	}
}
