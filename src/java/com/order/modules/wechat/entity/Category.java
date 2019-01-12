package com.order.modules.wechat.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: 菜单
 */
@Getter
@Setter
public class Category {
    private Integer categoryId;

    private String categoryName;

    private String categoryDetail;

    private Integer categorySort;

    private Integer categoryShopId;

    private List<Product> products;
}
