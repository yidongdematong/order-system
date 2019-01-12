package com.order.modules.wechat.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: desc
 */
@Getter
@Setter
public class ShopCart {

    private Integer shopcartId;

    private Integer shopcartUserId;

    private Integer shopcartShopId;

    private Integer shopcartProductId;

    private Integer shopcartProductType;

    private Integer shopcartQuantity;

    private Date shopcartCreateTime;

    private BigDecimal shopcartPrice;

    private String shopcartDetail;

    private Product product;
}
