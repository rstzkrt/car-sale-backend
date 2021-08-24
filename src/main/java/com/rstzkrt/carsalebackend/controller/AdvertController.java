package com.rstzkrt.carsalebackend.controller;

import com.rstzkrt.carsalebackend.DTOs.AdvertDTO;
import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.Car;
import com.rstzkrt.carsalebackend.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RepositoryRestController
@RequestMapping("/advert")
public class AdvertController {

    @Autowired
    private AdvertService advertService;

    @GetMapping("/adverts")
    public ResponseEntity<List<Advert>> getAdverts(){
        return ResponseEntity.ok(advertService.getAdverts());
    }

    @GetMapping("/userAdverts/{userId}")
    public ResponseEntity<List<Advert>> getAdvertsByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(advertService.getAdvertsByUserId(userId));
    }

    //Advert Create, car included
    @PostMapping("/user/{userId}/createAdvert")
    public ResponseEntity<Advert> createAdvert(@RequestBody AdvertDTO advertDTO, @PathVariable Long userId){
        return ResponseEntity.ok(advertService.createAdvert(advertDTO,userId));
    }

}