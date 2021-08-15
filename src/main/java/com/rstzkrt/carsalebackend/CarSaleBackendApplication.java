package com.rstzkrt.carsalebackend;

import com.rstzkrt.carsalebackend.service.AdvertService;
import com.rstzkrt.carsalebackend.service.AppUserService;
import com.rstzkrt.carsalebackend.service.CarService;
import com.rstzkrt.carsalebackend.service.ReportService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarSaleBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarSaleBackendApplication.class, args);
    }

    CommandLineRunner run(CarService carService, AdvertService advertService, AppUserService appUserService, ReportService reportService){
       return args -> {
           //add mock data to database
       } ;
    }
}
