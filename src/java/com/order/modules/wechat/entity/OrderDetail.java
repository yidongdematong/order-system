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
public class OrderDetail {
    private Integer orderDetailId;

    private Integer orderDetailOrderId;

    private Integer orderDetailProductId;

    private Integer orderDetailProductType;

    private BigDecimal orderDetailProductPrice;

    private String orderDetailProductName;

    private Integer orderDetailQuantity;

    private String orderDetailProductDetail;

    private String orderDetailPrinterName;

    private Product product;
}
