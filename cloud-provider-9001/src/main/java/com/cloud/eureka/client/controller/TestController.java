package com.cloud.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("testMono")
    public Mono<String> testMono(String msg){
        return Mono.just("your msg is :"+msg);
    }

    @RequestMapping("testFlux")
    public Flux<String> testFlux(String msg1,String msg2){
        List<String> list = Arrays.asList();
        list.add(msg1);
        list.add(msg2);
        return Flux.fromIterable(list);
    }

}
