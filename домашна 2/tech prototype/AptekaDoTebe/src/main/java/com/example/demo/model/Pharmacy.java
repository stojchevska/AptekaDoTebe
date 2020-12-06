package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Data
@Getter
@Setter
public class Pharmacy {
    public Pharmacy(Long id, String name, String address, String phone, LocalTime working_hours) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.working_hours = working_hours;
    }

    private Long id;
    private String name;
    private String address;
    private String phone;
    private LocalTime working_hours;

}
