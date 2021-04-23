package com.hhu.springbootframe.controllor;

import com.hhu.springbootframe.entity.User;
import com.hhu.springbootframe.service.UserService;
import com.hhu.springbootframe.utils.ResponseResult.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springbootframe
 * @description: 用户信息Controller层
 * @author: Wang JinLei
 * @create: 2021-04-20 20:58
 */
@RestController
@RequestMapping(value = "/user")
@ResponseResult
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userInfo")
    public List<User> listUserInfo() {
        return userService.listUserInfo();
    }
}
