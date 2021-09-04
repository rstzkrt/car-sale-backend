package com.rstzkrt.carsalebackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
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
    private LocalDate postDate ;
    private Double price;
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Car car;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "posted_by")
    private AppUser postedBy;

    @OneToMany( cascade = CascadeType.ALL)
    private List<Report> reports=new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Image> Images=new ArrayList<>();

    public Advert(String description, String title, Double price, String address) {
        this.description = description;
        this.title = title;
        this.postDate = LocalDate.now();
        this.price = price;
        this.address = address;
    }

    public Advert(String description, String title, Double price, String address, Car car, AppUser postedBy) {
        this.description = description;
        this.title = title;
        this.postDate = LocalDate.now();
        this.price = price;
        this.address = address;
        this.car = car;
        this.postedBy = postedBy;
    }
}