package com.rstzkrt.carsalebackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarSaleBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarSaleBackendApplication.class, args);
    }

    CommandLineRunner run(){
       return args -> {
           //add mock data to database
       } ;
    }
}
