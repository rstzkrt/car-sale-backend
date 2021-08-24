package com.rstzkrt.carsalebackend.config;

import com.rstzkrt.carsalebackend.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.List;

@Projection(name = "carProjection", types = { Car.class })
public interface CarProjection {

    Long getCarId();

    String getBrand();

    String getTransmission();

    String getBodyType();

    Double getMileage();

    String getFuelType();

    String getCondition();


}