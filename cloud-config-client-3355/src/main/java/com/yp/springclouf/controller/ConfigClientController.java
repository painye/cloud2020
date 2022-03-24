package com.yp.springclouf.controller;
/**
 * @author pan
 * @date 2022/3/24 21:32
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : com.yp.springclouf.controller.ConfigClientController
 * @Description : 类描述
 * @author pan
 * @date 2022/3/24 21:32
 */

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;


    @GetMapping("/configInfo")
    public String configInfo(){
        return configInfo;
    }


}
