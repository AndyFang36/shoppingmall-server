package com.shoppingmall.dao;

import com.shoppingmall.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Mapper
@Repository
public interface UserDao {
    /**
     * 添加用户
     */
    int add(User user);

    /**
     * 查找用户是否已存在
     */
    User findOne(User user);

    /**
     * 更新用户信息
     */
    void updatePassword(User user);

    //查询所有用户信息
    List<User> findAll();

    /**
     * 删除用户
     */
    int deleteUser(User user);
}
