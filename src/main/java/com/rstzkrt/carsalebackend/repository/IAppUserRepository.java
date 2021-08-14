package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserRepository extends JpaRepository<AppUser,Long> {

}