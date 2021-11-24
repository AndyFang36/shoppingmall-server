package com.shoppingmall.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/** 购物车商品类 */
public class ShoppingCartItem implements Serializable {
    @Serial
    private static final long serialVersionUID = 619500111148872588L;

    /** 默认编号 */
    private Integer id;

    /** 外键，关联购物车 */
    private String shoppingCartId;

    /** 商品 */
    private Product product;

    /** 数量 */
    private Integer count;

    /** 添加到购物车的时间 */
    private Date addTime;

    /** 更新时间 */
    private Date updateTime;
}
