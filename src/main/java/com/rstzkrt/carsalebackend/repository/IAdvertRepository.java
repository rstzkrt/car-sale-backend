package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.entity.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAdvertRepository extends JpaRepository<Advert,Long> {
    List<Advert> findByAdvertIdIn(List<Long> AdvertIds);
}