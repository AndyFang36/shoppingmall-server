package com.shoppingmall.models;

import org.springframework.stereotype.Component;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Component
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -6322444422381864203L;

    /** 默认编号 */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 年龄
     */
    private Integer age;

    /** 购物车 */
    private ShoppingCart shoppingCart;

    /**
     * 收货地址
     */
    private List<ShippingAddress> shippingAddresses;
}