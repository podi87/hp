package com.hometools.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCtrl {

    @RequestMapping("/hello")
    public String test() {
        return "Hello World!";
    }

}
