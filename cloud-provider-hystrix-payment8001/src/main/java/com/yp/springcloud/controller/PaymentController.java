package com.yp.springcloud.controller;
/**
 * @author pan
 * @date 2022/3/23 22:34
 */

import com.yp.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.AppletAudioClip;

import javax.annotation.Resource;
import javax.annotation.security.PermitAll;

/**
 * @ClassName : com.yp.springcloud.controller.PaymentController
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 22:34
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
       String  result=paymentService.paymentInfo_OK(id);
       log.info("**********result:"+result);
       return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String  result=paymentService.paymentInfo_TimeOut(id);
        log.info("**********result:"+result);
        return result;
    }

    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String result=paymentService.paymentCircuitBreaker(id);
        log.info("********result："+result);
        return result;
    }

}
