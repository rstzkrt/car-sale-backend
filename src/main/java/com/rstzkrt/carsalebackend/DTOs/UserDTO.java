package com.rstzkrt.carsalebackend.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String avatar;
    private LocalDate dateOfBirth;
}
