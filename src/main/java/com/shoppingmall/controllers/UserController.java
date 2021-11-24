package com.shoppingmall.controllers;

import com.shoppingmall.models.User;
import com.shoppingmall.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(method = RequestMethod.POST)
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * <h2>处理登录</h2>
     */
    @RequestMapping("/login")
    @ResponseBody
    public User login(@RequestBody User submittedUser) {
        return userService.login(submittedUser);
    }
}