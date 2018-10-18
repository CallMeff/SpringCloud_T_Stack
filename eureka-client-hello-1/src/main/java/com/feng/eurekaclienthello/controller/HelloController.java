package com.feng.eurekaclienthello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc：打招呼
 * @title：HelloController
 * @author: tianfengluyao
 * @date: 2018/10/18 13:37
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "this is hello-1:hello";
    }
}
