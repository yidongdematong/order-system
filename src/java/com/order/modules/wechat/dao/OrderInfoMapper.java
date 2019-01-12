package com.order.modules.wechat.dao;

import com.order.modules.wechat.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: desc
 */
@Mapper
public interface OrderInfoMapper {

    List<OrderInfo> getOrderInfoListByShopIdAndUserId(Map<String, Object> paramMaps);
}
