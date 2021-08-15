package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.entity.Advert;


import java.util.List;

public interface AppUserService {
    List<Long> getFavourites(Long id);
}
