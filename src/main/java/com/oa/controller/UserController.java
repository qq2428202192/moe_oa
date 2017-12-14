package com.oa.controller;

import com.oa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 控制器
 * @Description:   子模块
 * @ClassName:     UserController.java
 * @author         moe
 * @Date           2017-12-14
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "alluser")
    public Object allUser(){
        return userService.sallUser();
    }

}
