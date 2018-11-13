package com.cloud.eureka.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Provider_9001_App {

    public static void main(String[] args) {
        SpringApplication.run(Provider_9001_App.class);
    }

}
