package com.imooc.product.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * ResultVO
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 1:28
 * Modified by:
 */
@Data
public class ResultVO<T> {

	/**
	 * 错误码
	 */
	private Integer code;

	/**
	 * 提示信息
	 */
	private String msg;

	/**
	 * 具体内容
	 */
	private T data;
}
