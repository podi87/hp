package com.hometools.login.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCtrl {

    @RequestMapping("/hello")
    public String test() {
        return "Hello World!";
    }

    @GetMapping({"/user", "/me"})
    public Map<String, String> user(final Principal principal) {
        Map<String, String> modelMap = new LinkedHashMap<>();
//        if (!(auth instanceof AnonymousAuthenticationToken) && (auth instanceof UsernamePasswordAuthenticationToken)){
//            UsernamePasswordAuthenticationToken upat = (UsernamePasswordAuthenticationToken) auth;
        modelMap.put("name", principal.getName());
        return modelMap;
    }

}
