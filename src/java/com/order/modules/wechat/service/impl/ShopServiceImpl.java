package com.order.modules.wechat.service.impl;

import com.order.common.utils.R;
import com.order.modules.wechat.dao.ShopMapper;
import com.order.modules.wechat.entity.Shop;
import com.order.modules.wechat.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.order.common.utils.MathUtils.algorithm;
import static java.lang.Double.parseDouble;

/**
 * @Author: wangh
 * @CreateDate: 2018/11/22
 * @Description: 店铺业务处理
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override

    public R getShopById(Integer shopId) {
        return null;
    }

    /**
     * @param paramMaps
     * @Author: wangh
     * @param: paramMaps {cityName:城市名称}
     * @Description: desc
     */
    @Override
    public R getShopList(Map<String, Object> paramMaps) {
        Map<String, Object> resultMaps = new HashMap<>();
        List<Shop> dataList = shopMapper.getShopList(paramMaps);
        for (Shop entity : dataList) {
            entity.setDistance(algorithm(parseDouble(paramMaps.get("longitude").toString()), parseDouble(paramMaps.get("latitude").toString()), entity.getShopLongBaidu(), entity.getShopLatBaidu()));
        }
        resultMaps.put("shopList", dataList);
        resultMaps.put("rCode", "success");
        resultMaps.put("totalCount", 10);
        resultMaps.put("pageIndex", 10);

        return R.ok(resultMaps);
    }

    @Override
    public R getDetail(Map<String, Object> paramMaps) {
        Map<String, Object> resultData = new HashMap<>();
        Shop shop = shopMapper.getDetail(paramMaps);
        resultData.put("shop", shop);
        resultData.put("rCode", "success");
        return new R().ok(resultData);
    }
}
