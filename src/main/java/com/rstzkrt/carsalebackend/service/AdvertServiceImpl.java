package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.DTOs.AdvertDTO;
import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.AppUser;
import com.rstzkrt.carsalebackend.entity.Car;
import com.rstzkrt.carsalebackend.entity.Image;
import com.rstzkrt.carsalebackend.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class AdvertServiceImpl implements AdvertService {

    @Autowired
    private IAdvertRepository advertRepository;

    @Autowired
    private IAppUserRepository appUserRepository;


    @Autowired
    private ICarRepository carRepository;


    public List<Advert> getAdverts(List<Long> idList){
        return advertRepository.findByAdvertIdIn(idList);
    }

    @Override
    public List<Advert> getAdverts() {
        return advertRepository.findAll();
    }

    @Override
    public List<Advert> getAdvertsByUserId(Long userId) {
        return advertRepository.findAllByPostedBy_AppUserId(userId);
    }

    @Override
    public List<Advert> getAdvertsByCarBrand(String brand) {
        return advertRepository.findAllByCarBrandLike(brand);
    }

    @Override
    public Advert findAdvertById(Long id) {
        return advertRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public Advert createAdvert(AdvertDTO advertDTO, Long userID) {
        AppUser user = appUserRepository.findById(userID).orElse(null);
        Advert advert=new Advert();
        List<Image> images=new ArrayList<>();
        Image image= new Image(advertDTO.getImageLink());
        images.add(image);

        Car car =new Car(advertDTO.getBrand(),advertDTO.getTransmission(),advertDTO.getMileage(),advertDTO.getBodyType(),advertDTO.getFuelType(),advertDTO.getCondition());
        carRepository.save(car);
        if(user!=null){
          advert=new Advert(advertDTO.getDescription(),
                  advertDTO.getTitle(),
                  advertDTO.getPrice(),
                  advertDTO.getAddress(),
                  car,
                  user);
          advert.setImages(images);//
          user.getAdverts().add(advert);
        }
        return advertRepository.save(advert);
    }
}