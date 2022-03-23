package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/23 15:26
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : com.yp.springcloud.PaymentMain8006
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 15:26
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class, args);
    }
}
