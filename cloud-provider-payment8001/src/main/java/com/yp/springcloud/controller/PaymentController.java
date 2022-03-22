package com.yp.springcloud.controller;
/**
 * @author pan
 * @date 2022/3/22 13:23
 */

import com.yp.springcloud.entities.CommonResult;
import com.yp.springcloud.entities.Payment;
import com.yp.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName : com.yp.springcloud.controller.PaymentController
 * @Description : 类描述
 * @author pan
 * @date 2022/3/22 13:23
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        log.info("------------接收参数："+payment+"------------");
        int result = paymentService.create(payment);
        log.info("********插入结果："+result);
        if(result>0){
            return new CommonResult(200, "插入数据成功", result);
        }else{
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******查询结果:"+payment);

        if(payment != null){
            return new CommonResult(200, "查询成功", payment);
        }else{
            return new CommonResult(444, "查询失败", null);
        }
    }
}

