package com.order.modules.wechat.controller;

import com.order.common.utils.Pager;
import com.order.common.utils.R;
import com.order.modules.wechat.service.FeedbackService;
import com.order.modules.wechat.service.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

import static com.order.common.utils.CommonConstant.PAGE_SIZE;

/**
 * @Author: wangh
 * @CreateDate: 2018/11/22
 * @Description: 店铺业务控制器
 */
@RestController
@RequestMapping("api/shop")
public class ShopController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShopController.class);

    @Autowired
    private ShopService shopService;
    @Autowired
    private FeedbackService feedbackService;


    /**
     * @Author: wangh
     * @Description: 获取店铺列表
     */
    @GetMapping("shopList")
    public R getList(Integer pageIndex, String cityName, String longitude, String latitude) {
        //构建查询参数
        final Map<String, Object> paramMaps = new HashMap<>();
        paramMaps.put("cityName", cityName);
        //分页参数
        Map<String, Object> pagerData = new HashMap<>();
        pagerData.put("page", pageIndex);
        pagerData.put("limit", PAGE_SIZE);
        paramMaps.put("pager", new Pager(pagerData));
        //经纬
        paramMaps.put("longitude", longitude);
        paramMaps.put("latitude", latitude);
        return shopService.getShopList(paramMaps);
    }

    /**
     * @Author: wangh
     * @param: param desc
     * @Description: 店铺详情
     */

    @PostMapping("detailShop")
    public R detail(Integer shopId, HttpSession session) {
        if (shopId > 0) {
            session.removeAttribute("tableNo");
            session.setAttribute("shopId", shopId);
        } else {
            shopId = (Integer) session.getAttribute("shopId");
        }
        Map<String, Object> paramMaps = new HashMap<>();
        paramMaps.put("shopId", shopId);
        return shopService.getDetail(paramMaps);
    }

    /**
     * @Author: wangh
     * @param: param desc
     * @Description: 店铺评论
     */
    @GetMapping("shopFeedback")
    public R feedBack(Integer pageIndex, Integer grade, HttpSession session) {
        Integer shopId = (Integer) session.getAttribute("shopId");
        Map<String, Object> paramMaps = new HashMap<>();
        paramMaps.put("shopId", shopId);
        paramMaps.put("grade", grade);

        Map<String, Object> pagerData = new HashMap<>();
        pagerData.put("page", pageIndex);
        pagerData.put("limit", PAGE_SIZE);
        paramMaps.put("pager", new Pager(pagerData));
        return feedbackService.getFeedbackList(paramMaps);

    }

}
