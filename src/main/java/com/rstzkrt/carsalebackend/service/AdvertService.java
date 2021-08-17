package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.entity.Advert;

import java.util.List;

public interface AdvertService {
    List<Advert> getAdverts(List<Long> idList);
    List<Advert> getAdverts();
    List<Advert> getAdvertsByUserId(Long userId);

    Advert createAdvert(Advert advert);
}
