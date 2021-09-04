package com.rstzkrt.carsalebackend.elasticsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rstzkrt.carsalebackend.entity.Advert;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;


@Document(indexName = "advert")
@TypeAlias("advert")
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
public class ESearchAdvert {

    @Id
    private String id;

    private Long advertId;

    private String title;
    private String description;
    private Double price;
    private String address;

    private Long carId;

    private String brand;
    private String transmission;
    private Double mileage ;
    private String bodyType;
    private String fuelType;
    private String condition;

    private Long userId;

    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String avatar;

    private String imageURl;


    public ESearchAdvert(Advert advert) {

        this.advertId = advert.getAdvertId();
        this.title = advert.getTitle();
        this.description = advert.getDescription();
        this.price = advert.getPrice();
        this.address = advert.getAddress();

        this.brand=advert.getCar().getBrand();
        this.bodyType=advert.getCar().getBodyType();
        this.carId=advert.getCar().getCarId();
        this.transmission=advert.getCar().getTransmission();
        this.fuelType=advert.getCar().getFuelType();
        this.mileage=advert.getCar().getMileage();
        this.condition=advert.getCar().getCondition();

        this.userId=advert.getPostedBy().getAppUserId();
        this.firstName=advert.getPostedBy().getFirstName();
        this.lastName=advert.getPostedBy().getLastName();
        this.email=advert.getPostedBy().getEmail();
        this.role=advert.getPostedBy().getRole();
        this.avatar=advert.getPostedBy().getAvatar();

        this.imageURl=advert.getImages().get(0).getLink();
    }
}
