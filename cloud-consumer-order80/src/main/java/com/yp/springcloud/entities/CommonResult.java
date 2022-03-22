package com.yp.springcloud.entities;
/**
 * @author pan
 * @date 2022/3/22 12:59
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : com.yp.springcloud.entities.CommonResult
 * @Description : 类描述
 * @author pan
 * @date 2022/3/22 12:59
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T> {
    /**
     * 编码
     */
    private Integer code;
    /**
     * 错误信息
     */
    private String message;
    /**
     * 传递对象
     */
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
