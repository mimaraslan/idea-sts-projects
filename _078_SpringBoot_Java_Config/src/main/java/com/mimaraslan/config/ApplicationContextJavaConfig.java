package com.mimaraslan.config;

import com.mimaraslan.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextJavaConfig {

    @Bean(name = "aService")
    public SelectService aService(){
        return new AService();
    }

    @Bean(name = "bService")
    public SelectService bService(){
        return new BService();
    }

    @Bean(name = "cService")
    public SelectService cService(){
        return new CService();
    }

    @Bean
    public MessageProcessor messageProcessor(){
        return new MessageProcessorImpl(aService());
    }
}
