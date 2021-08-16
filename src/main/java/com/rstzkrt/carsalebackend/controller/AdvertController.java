package com.rstzkrt.carsalebackend.controller;

import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.Report;
import com.rstzkrt.carsalebackend.service.AdvertService;
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

    @GetMapping("/reports/{appUserId}")//gets reports by appUser id
    public ResponseEntity<List<Report>> getReportsById(@PathVariable Long appUserId){
        //
        return ResponseEntity.ok().build();
    }


    @PostMapping("/create")
    public ResponseEntity<Advert> createAdverts(@RequestBody Advert advert){

        return ResponseEntity.ok(advertService.createAdvert(advert));
    }
}