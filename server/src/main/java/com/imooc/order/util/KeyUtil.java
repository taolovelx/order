package com.imooc.order.util;

import java.util.Random;

/**
 * KeyUtil
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 15:09
 * Modified by:
 */
public class KeyUtil {
	/**
	 * 生成唯一主键
	 * 时间+随机数
	 */
	public static synchronized String genuniqueKey(){
		Random random = new Random();
		Integer number = random.nextInt(900000) + 100000;
		return System.currentTimeMillis() + String.valueOf(number);
	}
}
