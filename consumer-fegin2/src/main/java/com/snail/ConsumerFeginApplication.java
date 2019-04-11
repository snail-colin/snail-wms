package com.snail;

import com.snail.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author colin
 * 2019/4/10
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PROVIDER-PRODUCT", configuration = RibbonConfig.class)
@EnableFeignClients("com.snail.service")
public class ConsumerFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeginApplication.class,args);
    }
}
