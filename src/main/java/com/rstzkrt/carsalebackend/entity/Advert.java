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

    @Length(max = 255)
    private String description;
    @Length(max = 100)
    private String title;
    @DateTimeFormat
    private LocalDate postDate;
    @Min(0)
    private Double price;
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private Car car;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "posted_by")
    private AppUser postedBy;

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

    public Advert(String description, String title, LocalDate postDate, Double price, String address, Car car, AppUser postedBy) {
        this.description = description;
        this.title = title;
        this.postDate = postDate;
        this.price = price;
        this.address = address;
        this.car = car;
        this.postedBy = postedBy;
    }
}