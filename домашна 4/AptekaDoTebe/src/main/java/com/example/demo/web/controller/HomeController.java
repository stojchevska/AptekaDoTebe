package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    @RequestMapping("/home")
    public class HomeController {

        @GetMapping("/mk")
        //navigates to the macedonian homepage
        public String getHomePageMk() {
            return "home_mk";
        }

        @GetMapping("/en")
        //navigates to the english homepage
        public String getHomePageEn() {
            return "home_en";
        }
    }

