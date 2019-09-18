package com.rizomm.m2.cours1.entities;


import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Integer id;
    private String firstname;
    private String lastname;
    private String email;

}
