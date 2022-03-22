package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/22 14:35
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : com.yp.springcloud.OrderMain80
 * @Description : 类描述
 * @author pan
 * @date 2022/3/22 14:35
 */

@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
