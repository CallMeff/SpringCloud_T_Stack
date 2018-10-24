package com.feng.eurekaclienthellocomsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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

    @HystrixCommand(fallbackMethod="fallback")
    public String queryHelloList(String s) {
        //调用eureka-client-hello服务
        String result = restTemplate.getForObject("http://eureka-client-hello/hello",String.class);
        return result;
    }

    private String fallback(String s){
        return "";
    }
}
