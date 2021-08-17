package com.rstzkrt.carsalebackend.controller;

import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.AppUser;
import com.rstzkrt.carsalebackend.entity.Report;
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

    @GetMapping("/reports/{appUserId}")//gets reports by appUser id
    public ResponseEntity<List<Report>> getReportsById(@PathVariable Long appUserId){
        //
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getFavourites(){
        return ResponseEntity.ok(appUserService.getAllUsers());
    }

    @PostMapping("/create")
    public ResponseEntity<AppUser> createAppUser(@RequestBody AppUser appUser) {

        return ResponseEntity.ok().build();
    }
}