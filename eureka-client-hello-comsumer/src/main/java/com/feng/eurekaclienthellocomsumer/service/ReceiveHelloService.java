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
    public List<String> queryHelloList() {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String result = restTemplate.getForObject("http://eureka-client-hello/hello",String.class);
            resultList.add(result);
        }
        return resultList;
    }

    private List<String> fallback(){
        return new ArrayList<>();
    }
}
