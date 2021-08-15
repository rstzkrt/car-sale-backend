package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.repository.ICarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService{

    @Autowired
    private ICarRepository carRepository;
}
