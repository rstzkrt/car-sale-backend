package com.rstzkrt.carsalebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {

    @Id
    private Long report_Id;

    @ManyToOne
    @JoinColumn(name = "appUser_id")
    private AppUser appUser;

    @ManyToOne
    @JoinColumn(name = "advert_id")
    private Advert advert;

    private String description;
}
