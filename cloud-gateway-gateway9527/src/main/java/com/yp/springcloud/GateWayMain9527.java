package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/24 15:35
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : com.yp.springcloud.GateWayMain9527
 * @Description : 类描述
 * @author pan
 * @date 2022/3/24 15:35
 */

@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class, args);
    }
}