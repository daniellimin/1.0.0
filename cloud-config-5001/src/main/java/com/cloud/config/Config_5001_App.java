package com.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class Config_5001_App {

    public static void main(String[] args) {
        SpringApplication.run(Config_5001_App.class);
    }
}
