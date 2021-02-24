package com.example.mybatisgenator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mybatisgenator.mapper")
@SpringBootApplication
public class MybatisGenatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGenatorApplication.class, args);
    }

}
