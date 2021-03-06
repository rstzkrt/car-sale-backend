package com.rstzkrt.carsalebackend.controller;

import com.rstzkrt.carsalebackend.DTOs.UserDTO;
import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.AppUser;
import com.rstzkrt.carsalebackend.entity.Report;
import com.rstzkrt.carsalebackend.service.AdvertService;
import com.rstzkrt.carsalebackend.service.AppUserService;
import com.rstzkrt.carsalebackend.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/user")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @Autowired
    private AdvertService advertService;

    @Autowired
    private ReportService reportService;

    @GetMapping("/favourites/{userId}")
    public ResponseEntity<List<Advert>> getFavourites(@PathVariable Long userId){
        List<Long> listAdvertId=appUserService.getFavourites(userId);
        return ResponseEntity.ok(advertService.getAdverts(listAdvertId));
    }

    @GetMapping("/reports/{appUserId}")//gets all reports by appUser id
    public ResponseEntity<List<Report>> getReportsById(@PathVariable Long appUserId){
        List<Long> listReportId=reportService.getReportIdsByUserId(appUserId);
        return ResponseEntity.ok(reportService.getAllReportsByUserId(listReportId));
    }

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getAllUsers(){
        return ResponseEntity.ok(appUserService.getAllUsers());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<AppUser> getUserById(@PathVariable Long userId){
        return ResponseEntity.ok(appUserService.getUserById(userId).orElse(null));
    }

    @PostMapping("/create")
    public ResponseEntity<AppUser> createAppUser(@RequestBody UserDTO userDTO) {

        return ResponseEntity.ok(appUserService.createUser(userDTO));
    }
}