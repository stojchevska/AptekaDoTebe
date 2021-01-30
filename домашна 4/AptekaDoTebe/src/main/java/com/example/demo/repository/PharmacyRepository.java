package com.example.demo.repository;

import com.example.demo.model.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RepositoryRestResource
public interface PharmacyRepository extends JpaRepository<Pharmacy,Long>, JpaSpecificationExecutor<Pharmacy> {
    Optional<Pharmacy> findByName(String name);
}
