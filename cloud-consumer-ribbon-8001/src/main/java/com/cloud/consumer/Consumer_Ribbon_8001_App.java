package com.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@EnableHystrix
@EnableCircuitBreaker
//@RibbonClient(name = "*") //如果只针对某个服务做负载均衡就加上
@EnableDiscoveryClient
@SpringBootApplication
public class Consumer_Ribbon_8001_App {

    public static void main(String[] args) {
        SpringApplication.run(Consumer_Ribbon_8001_App.class);
    }

}
