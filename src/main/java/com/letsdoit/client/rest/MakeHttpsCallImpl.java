package com.letsdoit.client.rest;

import com.letsdoit.client.services.MakeHttpsCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MakeHttpsCallImpl implements MakeHttpsCall {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String makeHttpsCall() {
        return restTemplate.getForObject("https://localhost:8085/onewayssl/v1/test",String.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
