package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.projection.AdvertProjection;
import com.rstzkrt.carsalebackend.entity.Advert;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(excerptProjection = AdvertProjection.class)
public interface IAdvertRepository extends JpaRepository<Advert,Long> {
    List<Advert> findByAdvertIdIn(List<Long> AdvertIds);

    Page<Advert> findByTitleContaining(@RequestParam("keyword") String keyword,Pageable pageable);

    List<Advert> findAllByPostedBy_AppUserId(Long userId);

    Page<Advert> findAllByCar_Brand(@RequestParam("brand") String brand, Pageable pageable);

    List<Advert> findAllByCarBrandLike(String brand);

}