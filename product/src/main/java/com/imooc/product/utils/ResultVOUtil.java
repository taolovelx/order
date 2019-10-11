package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * ResultVOUtil
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 1:55
 * Modified by:
 */
public class ResultVOUtil {

	public static ResultVO success(Object object) {
		ResultVO resultVO = new ResultVO();
		resultVO.setData(object);
		resultVO.setCode(0);
		resultVO.setMsg("成功");
		return resultVO;
	}
}
