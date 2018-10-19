package com.feng.eurekaclienthellocomsumer.controller;

import com.feng.eurekaclienthellocomsumer.service.ReceiveHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @desc：消费hello
 * @title：ReceiveHello
 * @author: tianfengluyao
 * @date: 2018/10/18 13:45
 */
@RestController
public class ReceiveHelloController {

    @Resource
    private ReceiveHelloService receiveHelloService;

    @GetMapping("/receive/hello")
    public List<String> receiveHello(){
        List<String> resultList = receiveHelloService.queryHelloList();
        return resultList;
    }
}
