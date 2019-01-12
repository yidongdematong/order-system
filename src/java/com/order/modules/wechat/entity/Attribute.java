package com.order.modules.wechat.entity;

import java.util.List;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: desc
 */
public class Attribute {
    private Integer attributeId;

    private Integer attributeProductId;

    private String attributeName;

    //属性值
    private List<AttributeValue> attributeValues;
}
