package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @Controller
    @RequestMapping("/home")
    public class HomeController {

        @GetMapping("/mk")
        public String getHomePageMk() {
            return "home_mk";
        }

        @GetMapping("/en")
        public String getHomePageEn() {
            return "home_en";
        }
    }
}
