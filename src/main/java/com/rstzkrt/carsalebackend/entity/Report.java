package com.rstzkrt.carsalebackend.entity;

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

    @ManyToOne
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;

    @ManyToOne
    @JoinColumn(name = "advert_id")
    private Advert advert;

    private String description;

    public Report(String description) {
        this.description = description;
    }
}
