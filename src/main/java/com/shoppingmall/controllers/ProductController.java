package com.shoppingmall.controllers;

import com.shoppingmall.models.Product;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/** 商品控制器 */
@RestController
public class ProductController {
    @RequestMapping("/getProductsByCategory")
    public List<Product> getProductsByCategory(@RequestBody String category){
        return null;
    }
}