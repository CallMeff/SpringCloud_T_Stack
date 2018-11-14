package com.feng.eurekaclienthello.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @desc：helloService
 * @title：HelloService
 * @author: tianfengluyao
 * @date: 2018/11/5 11:31
 */
@Service
@Slf4j
public class HelloService {

    public String sayHello(){
        log.info("nihao,{}","tianfeng");
        log.debug("nihao,{}","tianfeng");
        log.warn("nihao,{}","tianfeng");
        return "hello";
    }
}
