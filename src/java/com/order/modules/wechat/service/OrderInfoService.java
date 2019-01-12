package com.order.modules.wechat.service;

import com.order.modules.wechat.entity.OrderInfo;

import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: 订单业务
 */
public interface OrderInfoService {

    List<OrderInfo> getOrderInfoListByShopIdAndUserId(Map<String, Object> paramMaps);
}
