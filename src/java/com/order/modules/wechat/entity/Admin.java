package com.order.modules.wechat.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
public class Admin implements Serializable {
    private Integer adminId;

    private String adminName;

    private String adminPassword;

    private Integer adminShopId;

    private Date adminCreateTime;

    private Date adminUpdateTime;

    private Integer adminStatus;


}