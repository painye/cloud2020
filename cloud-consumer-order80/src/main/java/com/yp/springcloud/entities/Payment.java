package com.yp.springcloud.entities;
/**
 * @author pan
 * @date 2022/3/22 12:56
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName : com.yp.springcloud.entities.payment
 * @Description : 类描述
 * @author pan
 * @date 2022/3/22 12:56
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private long id;
    private String serial;
}
