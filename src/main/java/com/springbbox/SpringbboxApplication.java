package com.springbbox;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.springbbox.*.dao")
@SpringBootApplication
@EnableCaching
public class SpringbboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbboxApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    springbbox");
    }
}
