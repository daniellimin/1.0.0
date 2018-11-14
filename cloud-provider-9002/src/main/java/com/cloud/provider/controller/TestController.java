package com.cloud.provider.controller;

import com.alibaba.druid.support.json.JSONUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("testMono")
    public String testMono(String msg){
        return JSONUtils.toJSONString(msg);
    }

    @RequestMapping("testFlux")
    public String testFlux(String msg1,String msg2){
        List<String> list = new ArrayList<>();
        list.add(msg1);
        list.add(msg2);
        return JSONUtils.toJSONString(list);
    }

}
