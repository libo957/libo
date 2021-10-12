package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController("/")
public class TestController {

    @GetMapping("/")
    public String test(){
        return "我是test";
    }


}
