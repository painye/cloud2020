package com.yp.springcloud.config;
/**
 * @author pan
 * @date 2022/3/23 12:51
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : com.yp.springcloud.config.ApplicationContextConfig
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 12:51
 */

@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
