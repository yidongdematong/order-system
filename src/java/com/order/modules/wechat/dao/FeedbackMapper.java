package com.order.modules.wechat.dao;

import com.order.modules.wechat.entity.Feedback;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2018/11/29
 * @Description: 评论数据层
 */
@Mapper
public interface FeedbackMapper {

    List<Feedback> getFeedBackByShopId(Map<String, Object> paramMaps);
}
