package com.rstzkrt.carsalebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Advert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long advertId;

    private String description;
    private String title;
    private Date postDate;
    private Long price;
    private String address;

    @ManyToOne()
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;

    @OneToMany
    private List<Report> reports;

    //    users which liked the advert
//    @ManyToMany
//    private List<AppUser> likedUsers;
}