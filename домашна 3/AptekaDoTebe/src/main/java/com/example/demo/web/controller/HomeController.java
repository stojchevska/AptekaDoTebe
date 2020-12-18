package com.example.demo.web.controller;

public class HomeController {
    @Controller
    @RequestMapping("/home")
    public class HomeController {

        @GetMapping
        public String getHomePage() {
            return "home";
        }

        @GetMapping
        public String getHomePage() {
            return "home";
        }
    }
}
