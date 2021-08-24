package com.rstzkrt.carsalebackend.config;

import com.rstzkrt.carsalebackend.entity.*;
import org.apache.tomcat.jni.Local;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.List;

@Projection(name = "userProjection", types = { AppUser.class })
public interface AppUserProjection {

    Long getAppUserId();

    String getFirstName();

    String getLastName();

    String getEmail();

    String getRole();

    String getAvatar();

    Local getDateOfBirth();

    List<Advert> getAdverts();

    List<Report> getReports();

    List<Advert> getFavouriteAdverts();

}