package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/24 8:32
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : com.yp.springcloud.OrderHystrixMain80
 * @Description : 类描述
 * @author pan
 * @date 2022/3/24 8:32
 */

@SpringBootApplication
@EnableFeignClients
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
    }
}
