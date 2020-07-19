package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName : cloud2020
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/7/15 23:25
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
