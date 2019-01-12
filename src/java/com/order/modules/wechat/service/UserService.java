package com.order.modules.wechat.service;

import com.order.modules.wechat.entity.User;

import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: 用户业务
 */
public interface UserService {

    User getUserById(Map<String, Object> paramMaps);
}
