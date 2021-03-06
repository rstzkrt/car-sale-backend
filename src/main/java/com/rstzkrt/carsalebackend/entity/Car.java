package com.rstzkrt.carsalebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public Car(String brand, String transmission, Double mileage, String bodyType, String fuelType, String condition) {
        this.brand = brand;
        this.transmission = transmission;
        this.mileage = mileage;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.condition = condition;
    }
}
