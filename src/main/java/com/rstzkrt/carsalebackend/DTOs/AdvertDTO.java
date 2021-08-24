package com.rstzkrt.carsalebackend.DTOs;

import com.rstzkrt.carsalebackend.entity.AppUser;
import com.rstzkrt.carsalebackend.entity.Car;
import com.rstzkrt.carsalebackend.entity.Image;
import com.rstzkrt.carsalebackend.entity.Report;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdvertDTO {

    private String description;
    private String title;
    private LocalDate postDate;
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
