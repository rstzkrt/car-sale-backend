package com.rstzkrt.carsalebackend.controller;

import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.service.AdvertService;
import com.rstzkrt.carsalebackend.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @Autowired
    private AdvertService advertService;

    @GetMapping("/favourites/{userId}")
    public ResponseEntity<List<Advert>> getFavourites(@PathVariable Long userId){
        List<Long> listAdvertId=appUserService.getFavourites(userId);
        return ResponseEntity.ok(advertService.getAdverts(listAdvertId));
    }
}
