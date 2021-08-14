package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.AppUser;

import java.util.List;

public interface AppUserService {
    AppUser createUser();
    List<Advert> getFavourites();
    AppUser favorite(String dealId) throws Exception;
    AppUser unFavorite(String dealId) throws Exception;
    
}
