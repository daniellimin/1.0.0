package com.cloud.consumer.fallback;

import com.cloud.consumer.client.ProviderClient;
import org.springframework.stereotype.Component;

@Component
public class ProviderFallBack implements ProviderClient {
    @Override
    public String test(String msg) {
        return "fallback:" + msg;
    }

    @Override
    public String test1(String msg1, String msg2) {
        return "fallback:" + msg1 + "--" + msg2;
    }
}
