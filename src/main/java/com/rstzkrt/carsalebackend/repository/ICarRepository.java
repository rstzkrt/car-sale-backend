package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car,Long> {
}
