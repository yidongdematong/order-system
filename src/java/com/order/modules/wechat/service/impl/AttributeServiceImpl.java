package com.order.modules.wechat.service.impl;

import com.order.modules.wechat.dao.AttributeMapper;
import com.order.modules.wechat.entity.Attribute;
import com.order.modules.wechat.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: desc
 */
@Service
public class AttributeServiceImpl implements AttributeService {
    @Autowired
    private AttributeMapper attributeMapper;

    @Override
    public List<Attribute> getAttributeListByProductId(Map<String, Object> paramMaps) {
        return attributeMapper.getAttributeListByProductId(paramMaps);
    }
}
