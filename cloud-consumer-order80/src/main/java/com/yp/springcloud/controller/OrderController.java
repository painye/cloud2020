package com.yp.springcloud.controller;
/**
 * @author pan
 * @date 2022/3/22 14:43
 */

import com.yp.springcloud.entities.CommonResult;
import com.yp.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName : com.yp.springcloud.controller.OrderController
 * @Description : 类描述
 * @author pan
 * @date 2022/3/22 14:43
 */

@RestController
@Slf4j
public class OrderController {

    // public static  final String PAYMENT_URL = "http://localhost:8001";
    public static  final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create", payment, CommonResult.class);

    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, CommonResult.class);
    }

}
