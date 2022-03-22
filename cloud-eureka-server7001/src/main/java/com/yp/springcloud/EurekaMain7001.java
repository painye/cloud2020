package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/22 18:58
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName : com.yp.springcloud.EurekaMain7001
 * @Description : 类描述
 * @author pan
 * @date 2022/3/22 18:58
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}


