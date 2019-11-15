package com.zcc;

//import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.zcc.mapper")
public class App {
    public static void main(String[] args) {
        System.out.println("App method is running");
        SpringApplication.run(App.class,args);
    }
}
