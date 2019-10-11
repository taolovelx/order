package com.imooc.order.util;

import com.imooc.order.VO.ResultVO;

/**
 * ResultVOUtil
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 16:21
 * Modified by:
 */
public class ResultVOUtil {
	
	public static ResultVO success(Object object) {
		ResultVO resultVO = new ResultVO();
		resultVO.setCode(0);
		resultVO.setMsg("成功");
		resultVO.setData(object);
		return resultVO;
	}
}
