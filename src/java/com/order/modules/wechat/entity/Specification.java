package com.order.modules.wechat.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: desc
 */
@Getter
@Setter
public class Specification {
    private Integer specificationId;

    private Integer specificationProductId;

    private String specificationKey;

    private String specificationValue;

    private BigDecimal specificationPrice;
}
