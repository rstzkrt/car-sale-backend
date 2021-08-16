package com.rstzkrt.carsalebackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {

    @Id
    @SequenceGenerator(name = "car_sequence",
            sequenceName = "car_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,generator = "car_sequence")
    private Long carId;

    private String brand;
    private String transmission;
    private Double mileage ;
    private String bodyType;
    private String fuelType;
    private String condition;

    @JsonIgnore//
    @OneToOne(mappedBy = "car")
    private Advert advert;

    public Car(String brand, String transmission, Double mileage, String bodyType, String fuelType, String condition) {
        this.brand = brand;
        this.transmission = transmission;
        this.mileage = mileage;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.condition = condition;
    }
}
