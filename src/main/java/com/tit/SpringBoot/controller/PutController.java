package com.tit.SpringBoot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class PutController {
    @PutMapping("/put/{firstName}")
    public String hello(@PathVariable("firstName") String firstName,
                        @RequestParam(name = "lastName", required = true) String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
