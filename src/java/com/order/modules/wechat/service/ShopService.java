package com.order.modules.wechat.service;

import com.order.common.utils.R;

import java.util.Map;


/**
 * @Author: wangh
 * @CreateDate: 2018/11/22
 * @Description: 店铺业务层
 */
public interface ShopService {

     R getShopById(Integer shopId);

    /**
     * @Author: wangh
     * @param: paramMaps {cityName:城市名称}
     * @Description: desc
     */
     R getShopList(Map<String, Object> paramMaps);

     R getDetail(Map<String,Object> paramMaps);
}
