package com.rstzkrt.carsalebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appUserId;

    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String avatar;
    private LocalDate dateOfBirth;

    @OneToMany(targetEntity = Advert.class ,cascade = CascadeType.ALL)
    private List<Advert> adverts;

    @OneToMany(targetEntity = Report.class,cascade = CascadeType.ALL)
    private List<Report> reports;

    @ManyToMany
    @JoinTable(
            name = "user_favourites",
            joinColumns = @JoinColumn(name = "app_user_id"),
            inverseJoinColumns = @JoinColumn(name = "advert_id"))
     private List<Advert> favouriteAdverts;

    public AppUser(String firstName, String lastName, String email, String role, String avatar, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.avatar = avatar;
        this.dateOfBirth = dateOfBirth;
    }
}
