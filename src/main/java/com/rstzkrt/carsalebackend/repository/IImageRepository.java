package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IImageRepository extends JpaRepository<Image,Long> {
}
