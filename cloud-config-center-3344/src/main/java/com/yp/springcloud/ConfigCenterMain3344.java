package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/24 20:53
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : com.yp.springcloud.ConfigCenterMain3344
 * @Description : 类描述
 * @author pan
 * @date 2022/3/24 20:53
 */

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
