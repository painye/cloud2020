package com.yp.springcloud.service;
/**
 * @author pan
 * @date 2022/3/22 13:19
 */

import com.yp.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : com.yp.springcloud.service.PaymentService
 * @Description : 类描述
 * @author pan
 * @date 2022/3/22 13:19
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
