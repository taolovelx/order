package com.imooc.order.service.impl;

import com.imooc.order.dataobject.OrderMaster;
import com.imooc.order.dto.OrderDTO;
import com.imooc.order.enums.OrderStatusEnum;
import com.imooc.order.enums.PayStatusEnum;
import com.imooc.order.repository.OrderDetailRepository;
import com.imooc.order.repository.OrderMasterRepository;
import com.imooc.order.service.OrderService;
import com.imooc.order.util.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * OrderServiceImpl
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 12:27
 * Modified by:
 */
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderMasterRepository orderMasterRepository;
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	public OrderDTO create(OrderDTO orderDTO) {
		
		//todo 2. 查询商品信息(调用商品服务)
		//todo 3. 计算总价
		//todo 4. 扣库存（调用商品服务）
		
	 	// 5. 订单入库
		OrderMaster orderMaster = new OrderMaster();
		orderDTO.setOrderId(KeyUtil.genuniqueKey());
		BeanUtils.copyProperties(orderDTO, orderMaster);
		orderMaster.setOrderAmount(new BigDecimal(5));
		orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
		orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
		

		orderMasterRepository.save(orderMaster);
		
		return orderDTO;
	}
}
