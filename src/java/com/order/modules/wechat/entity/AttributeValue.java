package com.order.modules.wechat.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: desc
 */
@Getter
@Setter
public class AttributeValue {
    private Integer attributeValueId;

    private Integer attributeValueAttributeId;

    private String attributeValueValue;

    private Integer attributeValueState;

}
