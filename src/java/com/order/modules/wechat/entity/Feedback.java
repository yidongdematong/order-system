package com.order.modules.wechat.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @Author: wangh
 * @CreateDate: 2018/11/29
 * @Description: 评论
 */
@Getter
@Setter
public class Feedback {
    private Integer feedbackId;

    private Integer feedbackUserId;

    private Integer feedbackOrderId;

    private Integer feedbackShopId;

    private String feedbackShopName;

    private Integer feedbackRate;

    private String feedbackComment;

    private Date feedbackCreateTime;

    private String feedbackReply;

    private String feedbackTags;

    private User user;

    private List<String> productName;

}
