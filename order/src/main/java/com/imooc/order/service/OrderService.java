package com.imooc.order.service;

import com.imooc.order.dataobject.OrderMaster;
import com.imooc.order.dto.OrderDTO;

/**
 * OrderService
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 12:22
 * Modified by:
 */
public interface OrderService {

	OrderDTO create(OrderDTO orderDTO);
}
