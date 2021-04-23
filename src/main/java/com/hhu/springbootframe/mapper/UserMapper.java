package com.hhu.springbootframe.mapper;

import com.hhu.springbootframe.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: springbootframe
 * @description: 用户Mapper接口
 * @author: Wang JinLei
 * @create: 2021-04-20 20:53
 */
@Repository
public interface UserMapper {

    List<User> listUserInfo();
}
