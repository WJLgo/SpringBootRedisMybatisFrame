package com.hhu.springbootframe;

import com.alibaba.fastjson.JSON;
import com.hhu.springbootframe.config.SpringContextHolder;
import com.hhu.springbootframe.entity.User;
import com.hhu.springbootframe.mapper.UserMapper;
import com.hhu.springbootframe.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @program: springbootframe
 * @description: 测试类
 * @author: Wang JinLei
 * @create: 2021-04-20 21:07
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private Logger logger = LoggerFactory.getLogger(UserTest.class);
    @Test
    public void UserTest(){
        System.out.println(userService.listUserInfo());
    }
    // 测试mybatis缓存
    @Test
    public void testCache() {
        long begin = System.currentTimeMillis();
        List<User> persons = userService.listUserInfo();
        long ing = System.currentTimeMillis();
        userService.listUserInfo();
        long end = System.currentTimeMillis();
        logger.debug("第一次请求时间：" + (ing - begin) + "ms");
        logger.debug("第二次请求时间:" + (end - ing) + "ms");

        Assert.assertNotNull(persons);
        logger.debug(JSON.toJSONString(persons));
    }
    // 测试 通过Spring Aware获取Spring容器中的额Bean
    @Test
    public void testApplicationContextAware() {
        RedisTemplate redisTemplate = SpringContextHolder.getBean("redisTemplate");
        System.out.println(redisTemplate);
    }
}
