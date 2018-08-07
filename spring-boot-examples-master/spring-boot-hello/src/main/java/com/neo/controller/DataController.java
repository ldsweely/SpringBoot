package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
    @RequestMapping("/d/i")
    public String index() {
        return "Hello data index!";
    }
    @RequestMapping("/d/l")
    public String liuds() {
        return "数据列表!";
    }
}