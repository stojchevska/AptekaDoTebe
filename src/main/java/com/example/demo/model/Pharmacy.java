package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Data
@Getter
@Setter
public class Pharmacy {
    public Pharmacy(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    private Long id;
    private String name;
    private String address;

}
