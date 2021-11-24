package com.shoppingmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.shoppingmall.dao")
public class ShoppingmallServer {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingmallServer.class, args);
    }

}