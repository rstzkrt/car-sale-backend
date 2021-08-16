package com.rstzkrt.carsalebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Image {

    @Id
    @SequenceGenerator(name = "image_sequence",
            sequenceName = "image_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,generator = "image_sequence")
    private Long id;

    private String link;

    public Image(String link) {
        this.link = link;
    }
}
