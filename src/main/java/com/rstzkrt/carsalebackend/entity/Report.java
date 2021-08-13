package com.rstzkrt.carsalebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {

    @Id
    private Long report_Id;

    @ManyToOne
    private AppUser appUser;

    @ManyToOne
    private Advert advert;

    private String description;
}
