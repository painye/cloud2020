package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/23 20:38
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : com.yp.springcloud.OrderFeignMain80
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 20:38
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
