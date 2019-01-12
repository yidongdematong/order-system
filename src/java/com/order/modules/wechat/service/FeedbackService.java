package com.order.modules.wechat.service;

import com.order.common.utils.R;

import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2018/11/29
 * @Description: 评论业务层
 */
public interface FeedbackService {

   R getFeedbackList(Map<String, Object> paramsMaps);
}
