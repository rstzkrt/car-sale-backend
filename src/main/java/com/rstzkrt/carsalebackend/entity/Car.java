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
    private Long mileage ;
    private String bodyType;
    private String fuelType;
    private String condition;

    @OneToOne(mappedBy = "car")
    private Advert advert;
}
