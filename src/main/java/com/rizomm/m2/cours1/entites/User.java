package com.rizomm.m2.cours1.entites;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private String mail;
}
