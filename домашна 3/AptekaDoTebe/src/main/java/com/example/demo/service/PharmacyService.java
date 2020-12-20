package com.example.demo.service;

import com.example.demo.model.Pharmacy;
import com.example.demo.repository.PharmacyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PharmacyService {
    private final PharmacyRepository pharmacyRepository;

    public PharmacyService(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }

    public List<Pharmacy> findAll(){
        return this.pharmacyRepository.findAll();
    }
    public Optional<Pharmacy> findByName(String name) {

        return this.pharmacyRepository.findByName(name);
    }


}