package com.yp.springcloud.service;
/**
 * @author pan
 * @date 2022/3/23 22:32
 */

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName : com.yp.springcloud.service.PaymentService
 * @Description : 类描述
 * @author pan
 * @date 2022/3/23 22:32
 */

@Service
public class PaymentService {

    /**
     * 正常访问，一切OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id)
    {
        return "线程池:"+Thread.currentThread().getName()+"paymentInfo_OK,id: "+id+"\t"+"O(∩_∩)O";
    }

    /**
     * 超时访问，演示降级
     * @param id
     * @return
     */
    public String paymentInfo_TimeOut(Integer id)
    {
        Integer sleepTime=3;
        try { TimeUnit.SECONDS.sleep(sleepTime); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池:"+Thread.currentThread().getName()+"paymentInfo_TimeOut,id: "+id+"\t"+"O(∩_∩)O，耗费"+sleepTime+"秒";
    }


}
