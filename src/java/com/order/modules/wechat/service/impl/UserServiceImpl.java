package com.order.modules.wechat.service.impl;

import com.order.modules.wechat.dao.UserMapper;
import com.order.modules.wechat.entity.User;
import com.order.modules.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: 用户业务
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Map<String, Object> paramMaps) {
        return userMapper.getUserById(paramMaps);
    }
}
