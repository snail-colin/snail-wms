package com.snail.feign;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class FeignClientConfig {
    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "123456");
    }

    //配置文件后需要添加以下内容才能开启debug日志
    @Bean
    public Logger.Level getFeignLoggerLevel() {
        return Logger.Level.FULL ;
    }
}