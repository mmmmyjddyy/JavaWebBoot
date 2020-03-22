package com.chzu.user;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class,scanBasePackages = "com.boot.activiti")
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class,org.activiti.spring.boot.SecurityAutoConfiguration.class},scanBasePackages = "com.chzu")
@EnableSwagger2
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
