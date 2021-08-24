package com.rstzkrt.carsalebackend.config;

import com.rstzkrt.carsalebackend.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.List;

@Projection(name = "reportProjection", types = { Report.class })
public interface ReportProjection {

    Long getReportId();

    String getDescription();

    AppUser getAppUser();

    Advert getAdvert();

}