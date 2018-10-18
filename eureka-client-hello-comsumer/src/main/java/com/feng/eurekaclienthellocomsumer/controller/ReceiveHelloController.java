package com.feng.eurekaclienthellocomsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @desc：消费hello
 * @title：ReceiveHello
 * @author: tianfengluyao
 * @date: 2018/10/18 13:45
 */
@RestController
public class ReceiveHelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/receive/hello")
    public String receiveHello(){
        String result = restTemplate.getForObject("eureka-client-hello/hello",String.class);
        return result;
    }
}
