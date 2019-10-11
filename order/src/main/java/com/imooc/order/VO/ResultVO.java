package com.imooc.order.VO;

import lombok.Data;

/**
 * ResultVO
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 16:20
 * Modified by:
 */
@Data
public class ResultVO<T> {

	private Integer code;

	private String msg;

	private T data;
}
