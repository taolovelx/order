package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * OrderDetailRepository
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 11:31
 * Modified by:
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
