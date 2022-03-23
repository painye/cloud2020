package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/23 12:15
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : com.yp.springcloud.PaymentMain8004
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 12:15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
