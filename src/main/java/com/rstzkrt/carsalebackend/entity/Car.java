package com.rstzkrt.carsalebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long carId;

    private String brand;
    private String transmission;
    private Double mileage ;
    private String bodyType;
    private String fuelType;
    private String condition;

    public Car(String brand, String transmission, Double mileage, String bodyType, String fuelType, String condition) {
        this.brand = brand;
        this.transmission = transmission;
        this.mileage = mileage;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.condition = condition;
    }
}
