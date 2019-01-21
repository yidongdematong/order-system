package com.order.modules.wechat.controller;

import com.order.common.utils.Pager;
import com.order.common.utils.R;
import com.order.modules.wechat.entity.OrderInfo;
import com.order.modules.wechat.entity.User;
import com.order.modules.wechat.service.OrderInfoService;
import com.order.modules.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.order.common.utils.CommonConstant.PAGE_SIZE;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: 用户控制器
 */
@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private OrderInfoService orderInfoService;

    /**
     * @Author: wangh
     * @param: param desc
     * @Description: 个人中心
     */
    @GetMapping("center")
    public R center(@RequestParam(defaultValue = "1") Integer pageIndex, HttpSession session) throws Exception {
        User old_user = (User) session.getAttribute("user");
        Integer shopId = (Integer) session.getAttribute("shopId");
        Map<String, Object> userMaps = new HashMap<>();
        userMaps.put("userId", old_user.getUserId());
        User user = userService.getUserById(userMaps);
        Map<String, Object> orderInfoMaps = new HashMap<>();
        orderInfoMaps.put("shopId", shopId);
        orderInfoMaps.put("userId", user.getUserId());
        //分页参数
        Map<String, Object> pagerData = new HashMap<>();
        pagerData.put("page", pageIndex);
        pagerData.put("limit", PAGE_SIZE);
        orderInfoMaps.put("pager", new Pager(pagerData));
        List<OrderInfo> orderList = orderInfoService.getOrderInfoListByShopIdAndUserId(orderInfoMaps);
        R r = new R();
        r.put("user", user);
        r.put("orderList", orderList);
        r.put("totalCount", 10);
        r.put("rCode", "success");
        return null;
    }
}
