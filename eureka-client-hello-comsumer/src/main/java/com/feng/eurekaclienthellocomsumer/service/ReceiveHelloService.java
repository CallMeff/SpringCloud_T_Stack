package com.feng.eurekaclienthellocomsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @desc：接受打招呼服务类
 * @title：ReceiveHelloService
 * @author: tianfengluyao
 * @date: 2018/10/19 17:22
 */
@Service
public class ReceiveHelloService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(
            commandProperties = @HystrixProperty(name = "execution.isolation.strategy",value = ""),
            fallbackMethod="fallback")
    public String queryHelloList(String s) {
        //调用eureka-client-hello服务
        String result = restTemplate.getForObject("http://eureka-client-hello/hello",String.class);
        return result;
    }

    private String fallback(String s){
        return "服务繁忙，请稍后再试";
    }
}
