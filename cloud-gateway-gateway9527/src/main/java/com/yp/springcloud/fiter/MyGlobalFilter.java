package com.yp.springcloud.fiter;
/**
 * @author pan
 * @date 2022/3/24 18:07
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.lang.annotation.Annotation;

/**
 * @ClassName : com.yp.springcloud.fiter.MyGlobalFilter
 * @Description : 类描述
 * @author pan
 * @date 2022/3/24 18:07
 */
@Component
@Slf4j
public class MyGlobalFilter implements GlobalFilter, Ordered {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("**********自定以过滤器**************");
        String name=exchange.getRequest().getQueryParams().getFirst("name");
        if(name == null){
            log.info("****用户名为null，无法登录");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
