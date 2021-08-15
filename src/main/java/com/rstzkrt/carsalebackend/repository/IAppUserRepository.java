package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IAppUserRepository extends JpaRepository<AppUser,Long> {

    @Query(value = "SELECT advert_id FROM user_favourites where app_user_id=:Id",nativeQuery = true)
    List<Long> getFavouritesById(@Param("Id")Long Id);
}