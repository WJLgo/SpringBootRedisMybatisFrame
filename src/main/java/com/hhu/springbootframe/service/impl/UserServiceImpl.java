package com.hhu.springbootframe.service.impl;

import com.hhu.springbootframe.entity.User;
import com.hhu.springbootframe.mapper.UserMapper;
import com.hhu.springbootframe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springbootframe
 * @description: UserService实现类
 * @author: Wang JinLei
 * @create: 2021-04-20 20:57
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> listUserInfo() {
        return userMapper.listUserInfo();
    }
}
