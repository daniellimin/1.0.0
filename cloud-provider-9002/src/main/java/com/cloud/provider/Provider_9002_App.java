package com.cloud.provider;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Provider_9002_App {

    public static void main(String[] args) {
        SpringApplication.run(Provider_9002_App.class);
    }

}
