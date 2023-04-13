package com.example.WJ.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/")
    String home(){
        return "Hello Jogae";
    }

    public static void main(String[] args) {

    }
}
