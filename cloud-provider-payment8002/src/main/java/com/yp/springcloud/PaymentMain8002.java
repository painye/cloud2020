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
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
