package com.hhu.springbootframe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.security.RunAs;
@MapperScan(basePackages = "com.hhu.springbootframe.mapper")
@SpringBootApplication
public class SpringbootframeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootframeApplication.class, args);
    }

}
