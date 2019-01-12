package com.order.modules.wechat.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
/**
* @Author: wangh
* @param:  param desc
* @Description:  店铺
*/
@Getter
@Setter
public class Shop  {
    private Integer shopId;

    private String shopName;

    private String shopCode;

    private Integer shopType;

    private Integer shopOpenState;

    private String shopOpenTime;

    private String shopCloseTime;

    private String shopTelephone;

    private String shopOwner;

    private String shopOwnerMobile;

    private String shopProvinceName;

    private String shopProvinceCode;

    private String shopCityName;

    private String shopCityCode;

    private String shopAreaName;

    private String shopAreaCode;

    private String shopAddress;

    private String shopIntroduce;

    private String shopLogoUrl;

    private String shopBannerUrl;

    private String shopListpicUrl;

    private String shopNoticeUrl;

    private Double shopLongBaidu;

    private Double shopLatBaidu;

    private Date shopCreateTime;

    private Date shopUpdateTime;

    private Double shopRate;

    private Integer shopFeedbackCount;

    //距离
    private Double distance;

    //店铺管理员
    private Admin admin;


}