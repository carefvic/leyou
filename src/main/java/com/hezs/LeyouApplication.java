package com.hezs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hezs.mapper")
public class LeyouApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouApplication.class, args);
    }

}
