package com.shoppingmall.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/** 购物车 */
public class ShoppingCart implements Serializable {
    @Serial
    private static final long serialVersionUID = 1886845927874303511L;

    /** 默认编号 */
    private Integer id;

    /** 外键，关联用户 */
    private String userId;

    /** 商品项 */
    private List<ShoppingCartItem> shoppingCartItems;
}