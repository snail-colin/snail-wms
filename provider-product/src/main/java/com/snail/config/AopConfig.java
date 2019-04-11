package com.snail.config;

import com.snail.config.aop.LogAspectj;
import com.snail.config.aop.PageHelperAspect;
import com.snail.config.aop.LogAspectj;
import com.snail.config.aop.PageHelperAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    public LogAspectj logAspectj() {
        return new LogAspectj();
    }

    @Bean
    public PageHelperAspect pageHelperAspect() {
        return new PageHelperAspect();
    }

}
