package com.order.modules.wechat.dao;

import com.order.modules.wechat.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2018/11/22
 * @Description: 店铺数据层
 */
@Mapper
public interface ShopMapper {

    List<Shop> getShopList(Map<String, Object> paramsMap);

    /**
     * @Author: wangh
     * @param: param desc
     * @Description: 店铺详情
     */
    Shop getDetail(Map<String, Object> paramsMap);
}
