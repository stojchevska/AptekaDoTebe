package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalTime;

@Data
@Getter
@Setter
@Entity
public class Pharmacy {

    public Pharmacy(Long id, Long lon, Long lat, String amenity, String name) {
        this.id = id;
        this.lon = lon;
        this.lat = lat;
        this.amenity = amenity;
        this.name = name;
    }
    @Id
    private Long id;

    private Long lon;
    private Long lat;
    private String amenity;
    private String name;

    public Pharmacy() {

    }
}
