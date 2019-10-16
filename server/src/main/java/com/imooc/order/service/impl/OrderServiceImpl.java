package com.imooc.order.service.impl;

import com.imooc.order.dataobject.OrderDetail;
import com.imooc.order.dataobject.OrderMaster;
import com.imooc.order.dataobject.ProductInfo;
import com.imooc.order.dto.CartDTO;
import com.imooc.order.dto.OrderDTO;
import com.imooc.order.enums.OrderStatusEnum;
import com.imooc.order.enums.PayStatusEnum;
import com.imooc.order.repository.OrderDetailRepository;
import com.imooc.order.repository.OrderMasterRepository;
import com.imooc.order.service.OrderService;
import com.imooc.order.util.KeyUtil;
import com.imooc.product.client.ProductClient;
import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

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
	
	@Autowired
	private ProductClient productClient;
	
	public OrderDTO create(OrderDTO orderDTO) {

		String orderId = KeyUtil.genuniqueKey();

		// 2. 查询商品信息(调用商品服务)
		List<String> productIdList = orderDTO.getOrderDetailList().stream().map(OrderDetail::getProductId)
				.collect(Collectors.toList());
		List<ProductInfoOutput> productInfoList = productClient.listForOrder(productIdList);

		//3. 计算总价
		BigDecimal orderAmout = new BigDecimal(BigInteger.ZERO);
		for (OrderDetail orderDetail : orderDTO.getOrderDetailList()) {
			for (ProductInfoOutput productInfo : productInfoList) {
				if (productInfo.getProductId().equals(orderDetail.getProductId())) {
					orderAmout = productInfo.getProductPrice().
							multiply(new BigDecimal(orderDetail.getProductQuantity()))
							.add(orderAmout);
					BeanUtils.copyProperties(productInfo,orderDetail);
					orderDetail.setDetailId( KeyUtil.genuniqueKey());
					orderDetail.setOrderId(orderId);
					//订单详情入库
					orderDetailRepository.save(orderDetail);
					
				}
			}
		}
		
		// 4. 扣库存（调用商品服务）
		List<DecreaseStockInput> decreaseStockInputList = orderDTO.getOrderDetailList().stream().
				map(e -> new DecreaseStockInput(e.getProductId(), e.getProductQuantity()))
				.collect(Collectors.toList());
		productClient.decreaseStock(decreaseStockInputList);

		// 5. 订单入库
		OrderMaster orderMaster = new OrderMaster();
		orderDTO.setOrderId(orderId);
		BeanUtils.copyProperties(orderDTO, orderMaster);
		orderMaster.setOrderAmount(orderAmout);
		orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
		orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
		

		orderMasterRepository.save(orderMaster);
		
		return orderDTO;
	}
}
