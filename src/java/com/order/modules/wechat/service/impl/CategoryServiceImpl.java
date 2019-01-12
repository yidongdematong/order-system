package com.order.modules.wechat.service.impl;

import com.order.modules.wechat.dao.CategoryMapper;
import com.order.modules.wechat.entity.Category;
import com.order.modules.wechat.entity.Product;
import com.order.modules.wechat.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/12
 * @Description: 菜单业务层
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategoryListByShopId(Map<String, Object> paramMaps) {
        List<Category> categoryList = categoryMapper.getCategoryListByShopId(paramMaps);
        Category category = new Category();
        List<Product> products = new ArrayList<>();
        category.setCategoryName("热销");
        category.setCategoryDetail("热销");
        category.setCategorySort(-1);
        category.setCategoryShopId(Integer.valueOf(paramMaps.get("categoryShopId").toString()));
        category.setProducts(products);
        categoryList.add(0, category);
        return categoryList;
    }
}
