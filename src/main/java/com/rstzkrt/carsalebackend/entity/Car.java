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

    @Length(max = 40)
    private String brand;
    @Length(max = 50)
    private String transmission;
    @Min(0)
    private Double mileage ;
    @Length(max = 255)
    private String bodyType;
    @Length(max = 255)
    private String fuelType;
    @Length(max = 255)
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
