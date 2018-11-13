package com.hometools.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/test")
    public String test() {
        return "Hello World!";
    }

    @RequestMapping("/user")
    public Principal user(final Principal principal) {
        return principal;
    }



}
