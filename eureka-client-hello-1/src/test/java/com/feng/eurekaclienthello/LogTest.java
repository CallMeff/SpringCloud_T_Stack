package com.feng.eurekaclienthello;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @desc：测试日志
 * @title：LogTest
 * @author: tianfengluyao
 * @date: 2018/11/2 10:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogTest {

    public void printLog(){
        log.warn("nihao,{}","tianfeng");
    }
}
