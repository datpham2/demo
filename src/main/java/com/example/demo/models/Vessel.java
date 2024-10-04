package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "vessels")
public class Vessel {
    private String name;
    private String country;
    private String type;
    private int length;
    private int grossTonnage;
    private int yearBuilt;
    @Id
    private Long id;

    public Vessel() {
    }

    public Vessel(String name, String country, String type, int length, int grossTonnage, int yearBuilt) {
        this.name = name;
        this.country = country;
        this.type = type;
        this.length = length;
        this.grossTonnage = grossTonnage;
        this.yearBuilt = yearBuilt;
    }

    @Override
    public String toString() {
        return "Vessel{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                ", grossTonnage=" + grossTonnage +
                ", yearBuilt=" + yearBuilt +
                '}';
    }

}
