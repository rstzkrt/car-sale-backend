package com.rstzkrt.carsalebackend.controller;

import com.rstzkrt.carsalebackend.DTOs.AdvertDTO;
import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RestController
@RepositoryRestController
@RequestMapping("/advert")
public class AdvertController {

    @Autowired
    private AdvertService advertService;

    @GetMapping("/advert")
    public ResponseEntity<List<Advert>> getAdverts(){
        return ResponseEntity.ok(advertService.getAdverts());
    }

    @GetMapping("/advert/postedBy/{userId}")
    public ResponseEntity<List<Advert>> getAdvertsByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(advertService.getAdvertsByUserId(userId));
    }
    //Advert Create, car included
    @PostMapping("/user/{userId}/createAdvert")
    public ResponseEntity<Advert> createAdvert(@RequestBody AdvertDTO advertDTO, @PathVariable Long userId){
        return ResponseEntity.ok(advertService.createAdvert(advertDTO,userId));
    }

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/advert/car/{brand}")
    public ResponseEntity<List<Advert>> getAdvertByCarBrand(@PathVariable String brand){
        return ResponseEntity.ok(advertService.getAdvertsByCarBrand(brand));
    }
}