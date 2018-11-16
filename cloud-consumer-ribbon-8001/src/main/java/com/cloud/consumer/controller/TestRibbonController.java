package com.cloud.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestRibbonController implements AbstractController {
    @Autowired
    private RestTemplate template;

    @RequestMapping("/test")
    @HystrixCommand(fallbackMethod = "fallBackMethod")
    public String test(String msg) {
        String url = "http://CLOUD-PROVIDER/test/testMono?msg=" + msg;
        return "response :" + template.getForObject(url, String.class);
    }

    @RequestMapping("/test1")
    @HystrixCommand(fallbackMethod = "fallBackMethod")
    public String test(String msg1, String msg2) {
        String url = "http://CLOUD-PROVIDER/test/testFlux?msg1=" + msg1 + "&msg2=" + msg2;
        return "response :" + template.getForObject(url, String.class);
    }

    public String fallBackMethod(String msg) {
        return "fallback:" + msg;
    }

    public String fallBackMethod(String msg1, String msg2) {
        return "fallback:" + msg1 + "---" + msg2;
    }
}
