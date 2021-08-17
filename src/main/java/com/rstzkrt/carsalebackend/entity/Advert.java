package com.rstzkrt.carsalebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Advert {

    @Id
    @SequenceGenerator(name = "advert_sequence",
            sequenceName = "advert_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,generator = "advert_sequence")
    private Long advertId;

    private String description;
    private String title;
    private LocalDate postDate;
    private Double price;
    private String address;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @JsonBackReference
    @ManyToOne()//fetch = FetchType.LAZY
    @JoinColumn(name = "app_user_app_user_id")
    private AppUser postedBy;

    @JsonManagedReference
    @OneToMany
    private List<Report> reports;

    @OneToMany
    private List<Image> Images;

    public Advert(String description, String title, LocalDate postDate, Double price, String address,Car car,AppUser postedBy) {
        this.description = description;
        this.title = title;
        this.postDate = postDate;
        this.price = price;
        this.address = address;
        this.car=car;
        this.postedBy=postedBy;
    }
}