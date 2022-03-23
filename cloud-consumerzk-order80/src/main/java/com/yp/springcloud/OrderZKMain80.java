package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/23 12:48
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : com.yp.springcloud.OrderZKMain80
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 12:48
 */

@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain80.class, args);
    }
}
