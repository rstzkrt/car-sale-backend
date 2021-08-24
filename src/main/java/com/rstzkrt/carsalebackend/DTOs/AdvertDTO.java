package com.rstzkrt.carsalebackend.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdvertDTO {

    private String description;
    private String title;
    private Double price;
    private String address;

    //Image
    private String imageLink;

    //Car
    private String brand;
    private String transmission;
    private Double mileage ;
    private String bodyType;
    private String fuelType;
    private String condition;


}
