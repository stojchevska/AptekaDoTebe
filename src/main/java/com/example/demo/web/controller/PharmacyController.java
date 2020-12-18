package com.example.demo.web.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pharmacy")
public class PharmacyController {
    @GetMapping("/all/mk")
    public String getAllPharmaciesMK() {
return "pharmacies";
    }
    @GetMapping("/map/mk")
    public String getMapMK(){
        return "mapa";
    }
    @GetMapping("/help/mk")
    public String getHelpMK(){
        return "help";
    }

    @GetMapping("/help/en")
    public String getHelpEN(){
        return "helpEN";
    }
    @GetMapping("/all/en")
    public String getAllPharmaciesEN(){
        return "pharmaciesEN";
    }
    @GetMapping("/map/en")
    public String getMapEN(){
        return "mapaEN";
    }
}
