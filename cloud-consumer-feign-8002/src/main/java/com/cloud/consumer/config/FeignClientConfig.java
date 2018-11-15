package com.cloud.consumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {
    @Bean
    public Logger.Level setLevel(){
        return Logger.Level.FULL;
    }
}
