package com.shoppingmall.services;

import com.shoppingmall.models.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** 用户服务类 */
public interface UserService {
    User login(User user);
}