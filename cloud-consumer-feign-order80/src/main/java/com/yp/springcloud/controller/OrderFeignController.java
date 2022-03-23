package com.yp.springcloud.controller;
/**
 * @author pan
 * @date 2022/3/23 20:47
 */

import com.yp.springcloud.entities.CommonResult;
import com.yp.springcloud.entities.Payment;
import com.yp.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : com.yp.springcloud.controller.OrderFeignController
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 20:47
 */

@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }


}
