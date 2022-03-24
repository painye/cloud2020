package com.yp.springclouf;
/**
 * @author pan
 * @date 2022/3/24 21:30
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.security.auth.login.Configuration;

/**
 * @ClassName : com.yp.springclouf.ConfigClientMain3355
 * @Description : 类描述
 * @author pan
 * @date 2022/3/24 21:30
 */

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class, args);
    }

}
