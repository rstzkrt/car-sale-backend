package com.rstzkrt.carsalebackend.controller;

import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.Report;
import com.rstzkrt.carsalebackend.service.AdvertService;
import com.rstzkrt.carsalebackend.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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

    @PostMapping("/create")
    public ResponseEntity<Advert> createAdverts(@RequestBody Advert advert){
        //
        return ResponseEntity.ok(advertService.createAdvert(advert));
    }
}