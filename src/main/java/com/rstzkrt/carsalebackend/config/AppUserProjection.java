package com.rstzkrt.carsalebackend.config;

import com.rstzkrt.carsalebackend.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.List;

@Projection(name = "appUserProjection", types = { AppUser.class })
public interface AppUserProjection {

    Long getAppUserId();

    String getFirstName();

    String getLastName();

    String getEmail();

    String getRole();

    String getAvatar();

    LocalDate getDateOfBirth();

    List<Advert> getAdverts();

    List<Report> getReports();

    List<Advert> getFavouriteAdverts();

}