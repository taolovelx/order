package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * OrderMasterRepository
 * Created by: renhaitao
 * Description:
 * Created in: 2019-10-06 11:31
 * Modified by:
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
