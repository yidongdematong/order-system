package com.order.modules.wechat.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: wangh
 * @CreateDate: 2018/11/29
 * @Description: 用户
 */
@Getter
@Setter
public class User {
    private Integer userId;

    private String userNickName;

    private String userMobile;

    private String userHeadUrl;

    private Integer userType;

    private String userOpenId;

    private Integer userSex;

    private BigDecimal userBalance;

    private BigDecimal userFrozenBalance;

    private Date userCreateTime;

    private Integer userFans;

    //消费次数
    private Integer num;

    //最近到店消费时间
    private Date userPayTime;
}
