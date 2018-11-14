package com.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestRibbonController {
    @Autowired
    private RestTemplate template;

    @RequestMapping("/test")
    public String test(String msg){
        return "response :"+ template.getForObject("http://cloud-provider-1",String.class);
    }
}
