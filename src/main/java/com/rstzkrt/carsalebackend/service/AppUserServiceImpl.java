package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.DTOs.UserDTO;
import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.AppUser;
import com.rstzkrt.carsalebackend.entity.Report;
import com.rstzkrt.carsalebackend.repository.IAppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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
    public Optional<AppUser> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    @Transactional
    @Override
    public AppUser createUser(UserDTO userDTO) {
        AppUser user=new AppUser(userDTO.getFirstName(),userDTO.getLastName(),userDTO.getEmail(),userDTO.getRole(),userDTO.getAvatar(),userDTO.getDateOfBirth());
        return userRepository.save(user);
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
