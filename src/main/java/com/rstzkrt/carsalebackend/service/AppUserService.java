package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.AppUser;
import com.rstzkrt.carsalebackend.entity.Report;


import java.util.List;

public interface AppUserService {
    List<Long> getFavourites(Long id);
    List<AppUser> getAllUsers();
    AppUser createUser(AppUser appUser);
    void createAdvert(AppUser appUser,Advert advert);
    void createReport(AppUser appUser, Report report);
}
