package com.yp.springboot.config;
/**
 * @author pan
 * @date 2022/3/23 16:09
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : com.yp.springboot.config.ApplicationContexConfig
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 16:09
 */

@Configuration
public class ApplicationContextConfig{

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
