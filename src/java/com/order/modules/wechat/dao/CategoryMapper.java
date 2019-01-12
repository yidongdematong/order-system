package com.order.modules.wechat.dao;

import com.order.modules.wechat.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: 菜单数据层
 */
@Mapper
public interface CategoryMapper {

    List<Category> getCategoryListByShopId(Map<String, Object> paramMaps);
}
