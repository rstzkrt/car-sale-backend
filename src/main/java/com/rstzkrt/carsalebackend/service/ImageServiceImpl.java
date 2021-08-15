package com.rstzkrt.carsalebackend.service;

import com.rstzkrt.carsalebackend.repository.IImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService{

    @Autowired
    private IImageRepository imageRepository;

}
