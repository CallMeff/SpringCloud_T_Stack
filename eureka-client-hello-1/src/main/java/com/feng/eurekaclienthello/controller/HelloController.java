package com.feng.eurekaclienthello.controller;

import com.feng.eurekaclienthello.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @desc：打招呼
 * @title：HelloController
 * @author: tianfengluyao
 * @date: 2018/10/18 13:37
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("/hello")
    public String sayHello() throws InterruptedException {
        long sleepTime = new Random().nextInt(1000);
        Thread.sleep(sleepTime);
        helloService.sayHello();
        return "this is hello-1:hello；"+sleepTime;
    }
}
