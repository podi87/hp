package com.hometools.login.controller;

import java.util.Map;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ctrl {

    @GetMapping
    public String index(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(!(auth instanceof AnonymousAuthenticationToken)) {
            OAuth2Authentication oa2Auth = (OAuth2Authentication) auth;
            Map detailsMap = (Map) oa2Auth.getUserAuthentication().getDetails();
            model.addAttribute("authenticated", oa2Auth.isAuthenticated());
            model.addAttribute("name", detailsMap.get("name"));
        }
        return "index.html";
    }
}
