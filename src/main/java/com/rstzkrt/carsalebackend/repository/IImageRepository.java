package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.projection.ImageProjection;
import com.rstzkrt.carsalebackend.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(excerptProjection = ImageProjection.class)
public interface IImageRepository extends JpaRepository<Image,Long> {
}
