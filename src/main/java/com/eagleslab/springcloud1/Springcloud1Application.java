package com.eagleslab.springcloud1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Springcloud1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud1Application.class, args);
    }
    @RequestMapping("sayHello")
    public String sayHello(String name){
        return name+"你好";
    }

}
