package com.order.modules.wechat.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: desc
 */
@Getter
@Setter
public class OrderInfo {
    private Integer orderInfoId;

    private Integer orderInfoShopId;

    private String orderInfoShopName;

    private String orderInfoOrderNo;

    private Integer orderInfoUserId;

    private Date orderInfoCreateTime;

    private Date orderInfoPayTime;

    private String orderInfoMobile;

    private Integer orderInfoIsHotel;

    private Integer orderInfoType;

    private Integer orderInfoState;

    private Integer orderInfoPayType;

    private Integer orderInfoPayState;

    private Integer orderInfoCommentState;

    private Date orderInfoCommentTime;

    private BigDecimal orderInfoAmount;

    private BigDecimal orderInfoBalance;

    private BigDecimal orderInfoDiscount;

    private BigDecimal orderInfoRealPay;

    private String orderInfoTableNo;

    private Integer orderInfoPrintState;

    private String orderInfoPrinterName;

    private Integer orderInfoUserCouponId;

    //订单详情
    private List<OrderDetail> orderDetails;

    //用户
    private User user;

    //总额
    private Double amount;
}
