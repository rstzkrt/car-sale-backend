package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.entity.Advert;
import com.rstzkrt.carsalebackend.entity.AppUser;
import com.rstzkrt.carsalebackend.repository.IAdvertRepository;
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
    private IAdvertRepository advertRepository;

    @Override
    public AppUser createUser() {
        return null;
    }

    @Override
    public List<Advert> getFavourites() {
        return null;
    }

    @Override
    public AppUser favorite(String dealId) throws Exception {
        return null;
    }

    @Override
    public AppUser unFavorite(String dealId) throws Exception {
        return null;
    }
}
