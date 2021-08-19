package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.DTOs.UserDTO;
import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.AppUser;
import com.rstzkrt.carsalebackend.entity.Report;


import java.util.List;
import java.util.Optional;

public interface AppUserService {
    List<Long> getFavourites(Long id);
    List<AppUser> getAllUsers();

    Optional<AppUser> getUserById(Long userId);
    AppUser createUser(UserDTO userDTO);
    void createAdvert(AppUser appUser,Advert advert);
    void createReport(AppUser appUser, Report report);
}
