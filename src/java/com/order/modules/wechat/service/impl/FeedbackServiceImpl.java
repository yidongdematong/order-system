package com.order.modules.wechat.service.impl;

import com.order.common.utils.R;
import com.order.modules.wechat.dao.FeedbackMapper;
import com.order.modules.wechat.entity.Feedback;
import com.order.modules.wechat.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2018/11/29
 * @Description: 评论业务层
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackMapper feedbackMapper;

    @Override
    public R getFeedbackList(Map<String, Object> paramsMaps) {
        Map<String, Object> resultMap = new HashMap<>();
        List<Feedback> feedbackList = feedbackMapper.getFeedBackByShopId(paramsMaps);
        resultMap.put("feedbackList", feedbackList);
        resultMap.put("rCode", "success");
        resultMap.put("totalCount", 10);
        return new R().ok(resultMap);
    }
}
