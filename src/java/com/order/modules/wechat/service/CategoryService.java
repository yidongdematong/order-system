package com.order.modules.wechat.service;

import com.order.common.utils.R;
import com.order.modules.wechat.entity.Category;

import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: 菜单业务
 */
public interface CategoryService {

    List<Category> getCategoryListByShopId(Map<String, Object> paramMaps);
}
