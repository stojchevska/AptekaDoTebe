package com.example.demo.web.controller;

import com.example.demo.model.Pharmacy;
import com.example.demo.service.PharmacyService;
import org.springframework.data.repository.query.Param;
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

    public PharmacyController(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    @PostMapping("/all/")
    public String search(Model model, @Param("name") String name) {
        Optional<Pharmacy> pharmacies = pharmacyService.findByName(name);
        model.addAttribute("pharmacies", pharmacies);
        model.addAttribute("name", name);

        return "pharmacy_mk";
    }

    @GetMapping("/all/mk")
    public String getPharmaciesMK(@RequestParam(required = false) String error, Model model) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        List<Pharmacy> pharmacies = this.pharmacyService.findAll();
        model.addAttribute("pharmacies", pharmacies);

        return "pharmacy_mk";
    }

    @GetMapping("/map/mk")
    public String getMapMK() {
        return "map_mk";
    }

    @GetMapping("/help/mk")
    public String getHelpMK() {
        return "help_mk";
    }

    @GetMapping("/help/en")
    public String getHelpEN() {
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
    public String getMapEN() {
        return "map_en";
    }
}