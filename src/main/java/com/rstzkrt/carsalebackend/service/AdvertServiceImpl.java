package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AdvertServiceImpl implements AdvertService {

    @Autowired
    private IAdvertRepository advertRepository;
    @Autowired
    private ICarRepository carRepository;
    @Autowired
    private IAppUserRepository appUserRepository;
    @Autowired
    private IImageRepository imageRepository;
    @Autowired
    private IReportRepository reportRepository;

    public List<Advert> getAdverts(List<Long> idList){
        return advertRepository.findByAdvertIdIn(idList);
    }

    @Override
    public List<Advert> getAdverts() {
        return advertRepository.findAll();
    }

    @Override
    public Advert createAdvert() {
        return null;
    }

}