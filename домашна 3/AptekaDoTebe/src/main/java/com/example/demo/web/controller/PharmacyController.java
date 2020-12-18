package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class PharmacyController {
    @Controller
    @RequestMapping("/pharmacy")
    public class PharmacyController {
        @GetMapping("/all/mk")
        public String getAllPharmaciesMK() {
            return "pharmacy_mk";
        }
        @GetMapping("/map/mk")
        public String getMapMK(){
            return "map_mk";
        }
        @GetMapping("/help/mk")
        public String getHelpMK(){
            return "help_mk";
        }

        @GetMapping("/help/en")
        public String getHelpEN(){
            return "help_en";
        }
        @GetMapping("/all/en")
        public String getAllPharmaciesEN(){
            return "pharmacy_en";
        }
        @GetMapping("/map/en")
        public String getMapEN(){
            return "map_en";
        }
    }

}
