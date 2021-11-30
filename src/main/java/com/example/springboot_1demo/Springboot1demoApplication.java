package com.example.springboot_1demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@RequestMapping("/api")
public class Springboot1demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1demoApplication.class, args);
    }


    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "index.html";
    }



}
