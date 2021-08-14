package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.entity.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdvertRepository extends JpaRepository<Advert,Long> {

}