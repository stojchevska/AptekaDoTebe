package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Data
@Getter
@Setter
public class Pharmacy {

    public Pharmacy(Long id, String name, Long lon, Long lat) {
        this.id = id;
        this.name = name;
        this.lon = lon;
        this.lat = lat;
    }

    private Long id;
    private String name;
    private Long lon;
    private Long lat;

    public Pharmacy() {

    }
}
