package com.yp.springcloud;
/**
 * @author pan
 * @date 2022/3/24 13:24
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName : com.yp.springcloud.HystrixDashboardMain9001
 * @Description : 类描述
 * @author pan
 * @date 2022/3/24 13:24
 */

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class, args);
    }
}
