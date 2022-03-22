package com.yp.springcloud.service.impl;
/**
 * @author pan
 * @date 2022/3/22 13:20
 */

import com.yp.springcloud.dao.PaymentDao;
import com.yp.springcloud.entities.Payment;
import com.yp.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName : com.yp.springcloud.service.impl.PaymentServiceImpl
 * @Description : 类描述
 * @author pan
 * @date 2022/3/22 13:20
 */

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
