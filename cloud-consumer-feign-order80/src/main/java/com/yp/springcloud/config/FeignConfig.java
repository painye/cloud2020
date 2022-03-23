package com.yp.springcloud.config;
/**
 * @author pan
 * @date 2022/3/23 21:16
 */

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : com.yp.springcloud.config.FeignConfig
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 21:16
 */

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }


}
