package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }
    @RequestMapping("/liuds")
    public String liuds() {
        return "你好，刘笃师!";
    }
}