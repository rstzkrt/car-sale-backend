package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.AppUser;
import com.rstzkrt.carsalebackend.entity.Report;
import com.rstzkrt.carsalebackend.repository.IAppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService{

    @Autowired
    private IAppUserRepository userRepository;

    @Override
    public List<Long> getFavourites(Long id) {
        return userRepository.getFavouritesById(id);
    }

    @Override
    public List<AppUser> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public AppUser createUser(AppUser appUser) {
        return userRepository.save(appUser);
    }

    @Override
    public void createAdvert(AppUser appUser,Advert advert) {
         userRepository.saveAdverts(appUser.getAppUserId(), advert.getAdvertId());
    }

    @Override
    public void createReport(AppUser appUser,Report report) {
        userRepository.saveReports(appUser.getAppUserId(),report.getReportId());
    }


}
