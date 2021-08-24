package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.projection.CarProjection;
import com.rstzkrt.carsalebackend.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(excerptProjection = CarProjection.class)
public interface ICarRepository extends JpaRepository<Car,Long> {
}
