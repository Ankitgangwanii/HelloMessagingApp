package com.tit.SpringBoot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class PostController{
    @PostMapping("/post")
    public String hello(@RequestBody UserDTO user){
        return "Hello "+ user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}

