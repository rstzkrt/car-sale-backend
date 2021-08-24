package com.rstzkrt.carsalebackend.projection;

import com.rstzkrt.carsalebackend.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.List;

@Projection(name = "imageProjection", types = { Image.class })
public interface ImageProjection {

    Long getImageId();

    String getLink();

}