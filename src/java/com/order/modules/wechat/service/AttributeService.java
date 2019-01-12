package com.order.modules.wechat.service;

import com.order.modules.wechat.entity.Attribute;

import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: desc
 */
public interface AttributeService {
    List<Attribute> getAttributeListByProductId(Map<String, Object> paramMaps);
}
