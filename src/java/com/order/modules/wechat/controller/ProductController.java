package com.order.modules.wechat.controller;

import com.order.common.utils.R;
import com.order.modules.wechat.entity.Category;
import com.order.modules.wechat.entity.Product;
import com.order.modules.wechat.entity.ShopCart;
import com.order.modules.wechat.entity.User;
import com.order.modules.wechat.service.AttributeService;
import com.order.modules.wechat.service.CategoryService;
import com.order.modules.wechat.service.ShopCartService;
import com.order.modules.wechat.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wangh
 * @CreateDate: 2019/1/11
 * @Description: 商品控制器
 */
@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ShopCartService shopCartService;
    @Autowired
    private AttributeService attributeService;
    @Autowired
    private SpecificationService specificationService;

    /**
     * @Author: wangh
     * @Description: 获取店铺列表
     */
    @GetMapping("allProduct")
    public R getAllProduct(HttpSession session) {
        User user = (User) session.getAttribute("user");
        Integer shopId = (Integer) session.getAttribute("shopId");
        Map<String, Object> paramMaps = new HashMap<>();
        paramMaps.put("categoryShopId", shopId);
        R r = new R();
        r.put("rCode", "success");
        r.put("fans", user.getUserFans());
//
        List<Category> categoryList = categoryService.getCategoryListByShopId(paramMaps);
        paramMaps.put("userId", user.getUserId());
        List<ShopCart> shopcartList = shopCartService.getShopCartListByShopIdAndUserId(paramMaps);
        for (Category category : categoryList) {
            for (Product product : category.getProducts()) {
                if (product.getProductType() == 2) {
                    Map<String, Object> attributeMaps = new HashMap<>();
                    attributeMaps.put("productId", product.getProductId());
                    product.setAttributes(attributeService.getAttributeListByProductId(attributeMaps));
                    product.setSpecifications(specificationService.getSpecificationListByProductId(attributeMaps));
                }
                if (null != shopcartList && shopcartList.size() > 0) {
                    for (ShopCart shopcart : shopcartList) {
                        if (product.getProductId().equals(shopcart.getShopcartProductId())) {
                            product.setShopcartId(shopcart.getShopcartId());
                            product.setCartCount(shopcart.getShopcartQuantity());
                        }
                    }
                }
            }
        }
        r.put("categoryList", categoryList);
        r.put("shopcartList", shopcartList);
        return r;
    }
}
