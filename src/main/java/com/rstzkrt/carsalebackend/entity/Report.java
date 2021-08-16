package com.rstzkrt.carsalebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Report {

    @Id
    @SequenceGenerator(name = "report_sequence",
            sequenceName = "report_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,generator = "report_sequence")
    private Long reportId;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "advert_id")
    private Advert advert;

    private String description;

    public Report(String description,AppUser appUser,Advert advert) {

        this.description = description;
        this.appUser=appUser;
        this.advert=advert;
    }
}
