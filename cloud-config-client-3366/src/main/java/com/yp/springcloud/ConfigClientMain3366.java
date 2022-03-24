package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/24 22:48
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : com.yp.springcloud.ConfigClientMain3366
 * @Description : 类描述
 * @author pan
 * @date 2022/3/24 22:48
 */

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3366.class, args);
    }
}
