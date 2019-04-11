package com.snail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author colin
 * 2019/4/10
 */
@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayApplication {

    public static void main(String[] args) {
        Test test = new Test();
        test.setId(1);
        System.out.println(test);
        SpringApplication.run(ApiGatewayApplication.class,args);
    }
}
