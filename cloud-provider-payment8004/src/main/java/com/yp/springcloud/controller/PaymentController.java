package com.yp.springcloud.controller;
/**
 * @author pan
 * @date 2022/3/23 12:18
 */


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName : com.yp.springcloud.controller.PaymentController
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 12:18
 */

@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;


    @RequestMapping("/payment/zk")
    public String paymentZk(){
        return "zookeeper: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }


}
