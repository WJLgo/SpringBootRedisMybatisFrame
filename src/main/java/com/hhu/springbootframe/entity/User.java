package com.hhu.springbootframe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: springbootframe
 * @description: 用户实体类
 * @author: Wang JinLei
 * @create: 2021-04-20 20:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private int id;
    private String userName;
    private String age;
}
