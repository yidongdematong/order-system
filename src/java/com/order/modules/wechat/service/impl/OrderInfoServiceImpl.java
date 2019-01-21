package com.order.modules.wechat.service.impl;

import com.order.modules.wechat.dao.OrderInfoMapper;
import com.order.modules.wechat.entity.OrderInfo;
import com.order.modules.wechat.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: 订单业务
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public List<OrderInfo> getOrderInfoListByShopIdAndUserId(Map<String, Object> paramMaps) {
        return orderInfoMapper.getOrderInfoListByShopIdAndUserId(paramMaps);
    }
}
