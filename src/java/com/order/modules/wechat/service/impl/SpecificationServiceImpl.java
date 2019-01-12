package com.order.modules.wechat.service.impl;

import com.order.modules.wechat.dao.SpecificationMapper;
import com.order.modules.wechat.entity.Specification;
import com.order.modules.wechat.service.SpecificationService;
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
public class SpecificationServiceImpl implements SpecificationService {
    @Autowired
    private SpecificationMapper specificationMapper;

    @Override
    public List<Specification> getSpecificationListByProductId(Map<String, Object> paramMaps) {
        return specificationMapper.getSpecificationListByProductId(paramMaps);
    }
}
