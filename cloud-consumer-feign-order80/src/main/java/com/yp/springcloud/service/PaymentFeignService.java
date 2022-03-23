package com.yp.springcloud.service;

import com.yp.springcloud.entities.CommonResult;
import com.yp.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author pan
 * @date 2022/3/23 20:43
 */

@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    /**
     * Feign会通过@FeignClient注解调用（）中的微服务对阶我们以下的method.类似于凭借成如下的url:
     *  http://CLOUD-PAYMENT-SERVICE/payment/get/{id}
     *  与restTemplate原理一致
     * @param id
     * @return
     */
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

}
