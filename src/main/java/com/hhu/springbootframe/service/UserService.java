package com.hhu.springbootframe.service;

import com.hhu.springbootframe.entity.User;

import java.util.List;

/**
 * @program: springbootframe
 * @description: 用户Service层
 * @author: Wang JinLei
 * @create: 2021-04-20 20:55
 */
public interface UserService {
    List<User> listUserInfo();
}
