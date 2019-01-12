package com.order.modules.wechat.dao;

import com.order.modules.wechat.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: 用户数据层
 */
@Mapper
public interface UserMapper {
    User getUserById(Map<String, Object> paramMaps);
}
