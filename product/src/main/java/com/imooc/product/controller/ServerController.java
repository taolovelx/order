package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServerController
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-07 9:03
 * Modified by:
 */
@RestController
public class ServerController {

	@GetMapping("/msg")
	public String msg() {
		return "this is product' msg1";
	}
}
