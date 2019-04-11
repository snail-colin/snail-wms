package com.snail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author colin
 * 2019/4/6
 */
@SpringBootApplication
//@EnableEurekaClient
public class ComsummerSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComsummerSysApplication.class,args);
    }
}
