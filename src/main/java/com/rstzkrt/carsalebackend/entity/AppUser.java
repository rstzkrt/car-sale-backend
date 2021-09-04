package com.rstzkrt.carsalebackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;
import org.springframework.context.annotation.Role;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AppUser {

    @Id
    @SequenceGenerator(name = "app_user_sequence",
            sequenceName = "app_user_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,generator = "app_user_sequence")
    private Long appUserId;

    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String avatar;
    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "app_user" ,cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Advert> adverts=new ArrayList<>();

    @OneToMany(targetEntity = Report.class , cascade = CascadeType.ALL)
    private List<Report> reports=new ArrayList<>();

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_favourites",
            joinColumns = @JoinColumn(name = "app_user_id"),
            inverseJoinColumns = @JoinColumn(name = "advert_id"))
     private List<Advert> favouriteAdverts=new ArrayList<>();

    public AppUser(String firstName, String lastName, String email, String role, String avatar, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.avatar = avatar;
        this.dateOfBirth = dateOfBirth;
    }
}
