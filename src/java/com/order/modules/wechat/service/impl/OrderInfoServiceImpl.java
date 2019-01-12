package com.order.modules.wechat.service.impl;

import com.order.modules.wechat.entity.OrderInfo;
import com.order.modules.wechat.service.OrderInfoService;
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
    @Override
    public List<OrderInfo> getOrderInfoListByShopIdAndUserId(Map<String, Object> paramMaps) {
        return null;
    }
}
