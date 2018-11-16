package com.cloud.consumer.controller;

import com.cloud.consumer.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Autowired
    private ProviderClient client;

    @RequestMapping("test")
    public String test(String msg) {
        return client.test(msg);
    }

    @RequestMapping("test1")
    public String test1(String msg1, String msg2) {
        return client.test1(msg1, msg2);
    }


}
