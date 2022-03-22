package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/22 12:45
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : com.yp.springcloud.PaymentMain8001
 * @Description : 类描述
 * @author pan
 * @date 2022/3/22 12:45
 */

@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
