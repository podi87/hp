package com.hometools.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ctrl {

    @GetMapping
    public String index() {
        return "index.html";
    }
}
