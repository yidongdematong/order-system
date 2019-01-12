package com.order.modules.wechat.controller;

import com.order.modules.wechat.entity.OrderInfo;
import com.order.modules.wechat.entity.User;
import com.order.modules.wechat.service.OrderInfoService;
import com.order.modules.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("center")
    public Map<String, Object> center(@RequestParam(defaultValue = "1") Integer pageIndex, HttpSession session) throws Exception {
        User old_user = (User) session.getAttribute("user");
        Integer shopId = (Integer) session.getAttribute("shopId");
        Map<String, Object> userMaps = new HashMap<>();
        userMaps.put("userId", old_user.getUserId());
      /*  User user = userService.getUserById(userMaps);
        List<OrderInfo> orderList = orderInfoService.getOrderInfoList(PageUtil.getStartNo(pageIndex, appConfig.getPage_size()), appConfig.getPage_size(), shopId, user.getUserId());
        Integer totalCount = orderInfoService.getOrderInfoCount(null, user.getUserId());
        map.put("user", user);
        map.put("orderList", orderList);
        map.put("totalCount", totalCount);
        map.put("rCode", "success");
        LOGGER.info("用户中心userId=" + user.getUserId());*/
        return null;
    }
}
