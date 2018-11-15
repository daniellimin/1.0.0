package com.cloud.consumer.client;

import com.cloud.consumer.config.FeignClientConfig;
import com.cloud.consumer.fallback.ProviderFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(serviceId = "CLOUD-PROVIDER",configuration = FeignClientConfig.class,fallback = ProviderFallBack.class)
public interface ProviderClient {

    @RequestMapping("/test/testMono")
    String test(@RequestParam("msg") String msg);

    @RequestMapping("/test/testFlux")
    String test1(@RequestParam("msg1")String msg1,@RequestParam("msg2")String msg2);

}
