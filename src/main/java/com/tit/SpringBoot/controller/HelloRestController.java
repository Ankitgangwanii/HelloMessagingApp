package com.tit.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @GetMapping
    public String hello() {
        return "Hello from BridgeLabz";
    }
}
