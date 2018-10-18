package com.feng.eurekaclienthello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientHello1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientHello1Application.class, args);
    }
}
