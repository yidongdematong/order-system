package com.order.modules.wechat.service.impl;

import com.order.modules.wechat.dao.ShopCartMapper;
import com.order.modules.wechat.entity.ShopCart;
import com.order.modules.wechat.service.ShopCartService;
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
public class ShopCartServiceImpl implements ShopCartService {
    @Autowired
    private ShopCartMapper shopCartMapper;

    @Override
    public List<ShopCart> getShopCartListByShopIdAndUserId(Map<String, Object> paramMaps) {
        return shopCartMapper.getShopCartListByShopIdAndUserId(paramMaps);

    }
}
