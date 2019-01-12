package com.order.modules.wechat.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: 商品条目
 */
@Getter
@Setter
public class Product {

    private Integer productId;

    private Integer productShopId;

    private Integer productCategoryId;

    private String productName;

    private String productCode;

    private String productPicDetail;

    private String productPicSmall;

    private String productIntroduce;

    private BigDecimal productPrice;

    private Integer productType;

    private Date productCreateTime;

    private Date productUpdateTime;

    private Integer productState;

    private Integer productStock;

    private Integer productCount;

    private Integer productHot;

    private Integer productFans;

    private Double productFansDiscount;

    private BigDecimal productFansPrice;

    //购物车数量
    private Integer cartCount;

    //购物车id
    private Integer shopcartId;

    //分类名称
    private String categoryName;

    //属性名
    private List<Attribute> attributes;

    //规格
    private List<Specification> specifications;

    //销量
    private Integer volume;

    //排名
    private Integer rowno;
}
