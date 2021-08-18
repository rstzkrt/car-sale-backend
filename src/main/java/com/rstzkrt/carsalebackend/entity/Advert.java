package com.rstzkrt.carsalebackend.entity;

import lombok.*;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
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
    @JoinColumn(name = "car")
    private Car car=null;

    @ManyToOne
    @JoinColumn(name = "posted_by")
    private AppUser postedBy=null;

    @OneToMany
    private List<Report> reports=new ArrayList<>();

    @OneToMany
    private List<Image> Images=new ArrayList<>();

    public Advert(String description, String title, LocalDate postDate, Double price, String address) {
        this.description = description;
        this.title = title;
        this.postDate = postDate;
        this.price = price;
        this.address = address;
    }

}