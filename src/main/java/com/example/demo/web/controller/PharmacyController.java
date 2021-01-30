package com.example.demo.web.controller;

import com.example.demo.model.Pharmacy;
import com.example.demo.repository.PharmacyRepository;
import com.example.demo.service.PharmacyService;
import com.sipios.springsearch.anotation.SearchSpec;
import net.minidev.json.JSONObject;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/pharmacy")
    public class PharmacyController {
    private final PharmacyService pharmacyService;
    private final PharmacyRepository pharmacyRepository;

    public PharmacyController(PharmacyService pharmacyService,PharmacyRepository pharmacyRepository) {
        this.pharmacyService = pharmacyService;
        this.pharmacyRepository=pharmacyRepository;
    }


    @GetMapping("/all/mk")
        public String getPharmaciesMK(@RequestParam(required = false) String error, Model model) {
            if (error != null && !error.isEmpty()) {
                //error handling
                model.addAttribute("hasError", true);
                model.addAttribute("error", error);
            }
            List<Pharmacy> pharmacies = this.pharmacyService.findAll();
            model.addAttribute("pharmacies", pharmacies);

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
        public String getPharmaciesEN(@RequestParam(required = false) String error, Model model) {
            if (error != null && !error.isEmpty()) {
                model.addAttribute("hasError", true);
                model.addAttribute("error", error);
            }
            List<Pharmacy> pharmacies = this.pharmacyService.findAll();
            model.addAttribute("pharmacies", pharmacies);
            return "pharmacy_en";
        }
        @GetMapping("/map/en")
        public String getMapEN(){
            return "map_en";
        }
    }


