package com.example.springboot06datamybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//不用每个mapper都加@mapper
@MapperScan(value = "com.example.springboot06datamybatis.mapper")
@SpringBootApplication
public class Springboot06DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06DataMybatisApplication.class, args);
    }
}
