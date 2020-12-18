package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/mk")
    public String getHomePageMK() {
        return "home";
    }

    @GetMapping("/en")
    public String getHomePageEN() {
        return "homeEN";
    }

}
