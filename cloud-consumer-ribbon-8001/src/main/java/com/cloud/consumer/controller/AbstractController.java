package com.cloud.consumer.controller;

public interface AbstractController {

    default String fallBackMethod(){
        return "fallback";
    }
}
