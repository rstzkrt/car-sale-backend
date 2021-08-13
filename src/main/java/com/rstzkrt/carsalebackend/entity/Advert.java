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

    @ManyToOne()
    private AppUser appUser;

    private String description;
    private String title;
    private Date postDate;
    private Long price;
    private String address;

    @OneToMany
    private List<Report> reports;

}