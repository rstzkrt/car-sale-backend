package com.rstzkrt.carsalebackend.config;

import com.rstzkrt.carsalebackend.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.List;

@Projection(name = "advertProjection", types = { Advert.class })
public interface AdvertProjection {

    Long getAdvertId();

    String getDescription();

    String getAddress();

    String getTitle();

    Double getPrice();

    Car getCar();

    AppUser getPostedBy();

    LocalDate getPostDate();

    List<Image> getImages();

    List<Report> getReports();

}