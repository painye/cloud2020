package com.yp.myRule;
/**
 * @author pan
 * @date 2022/3/23 19:11
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : com.yp.myRule.MySelfRule
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 19:11
 */

@Configuration
public class MySelfRule {

    @Bean
    public IRule getIRule(){
        return new RandomRule();
    }
}
