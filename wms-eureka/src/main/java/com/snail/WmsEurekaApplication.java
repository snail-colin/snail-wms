package com.snail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author colin
 * 2019/4/4
 */
@SpringBootApplication
@EnableEurekaServer
public class WmsEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmsEurekaApplication.class,args);
    }
}
