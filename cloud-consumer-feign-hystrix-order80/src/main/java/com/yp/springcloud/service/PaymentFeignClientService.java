package com.yp.springcloud.service;
/**
 * @author pan
 * @date 2022/3/24 12:02
 */

import org.springframework.stereotype.Component;

/**
 * @ClassName : com.yp.springcloud.service.PaymentFeignClientService
 * @Description : 类描述
 * @author pan
 * @date 2022/3/24 12:02
 */

@Component
public class PaymentFeignClientService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}
