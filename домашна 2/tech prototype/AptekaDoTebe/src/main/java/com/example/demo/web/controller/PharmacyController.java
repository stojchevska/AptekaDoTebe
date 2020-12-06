package com.example.demo.web.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pharmacy")
public class PharmacyController {
    @GetMapping("/all")
    public String getAllPharmacies() {
return "pharmacies";
    }
    @GetMapping("/map")
    public String getMap(){
        return "mapa";
    }
}
