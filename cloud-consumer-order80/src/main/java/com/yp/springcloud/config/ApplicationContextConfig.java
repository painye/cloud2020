package com.yp.springcloud.config;
/**
 * @author pan
 * @date 2022/3/22 14:44
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : com.yp.springcloud.config.ApplicationContextConfig
 * @Description : 类描述
 * @author pan
 * @date 2022/3/22 14:44
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    /**
     * @LoadBalanced：负载均衡注解
     */
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
