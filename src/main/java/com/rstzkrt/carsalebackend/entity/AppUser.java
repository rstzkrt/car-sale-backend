package com.rstzkrt.carsalebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appUserId;

    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String avatar;
    private Date dateOfBirth;

    @OneToMany(targetEntity = Advert.class ,cascade = CascadeType.ALL)
    private List<Advert> adverts;

   @OneToMany(targetEntity = Report.class,cascade = CascadeType.ALL)
    private List<Report> reports;

   @ManyToMany
   @JoinTable(
           name = "Favourite",
           joinColumns = @JoinColumn(name = "appUserId"),
           inverseJoinColumns = @JoinColumn(name = "advertId"))
    private List<Advert> favouriteAdverts;

}
