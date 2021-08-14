package com.rstzkrt.carsalebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Advert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long advertId;

    private String description;
    private String title;
    private Date postDate;
    private Long price;
    private String address;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne()
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;

    @OneToMany
    private List<Report> reports;

    @OneToMany
    private List<Image> advertImages;


    //    users which liked the advert
//    @ManyToMany
//    private List<AppUser> likedUsers;
}