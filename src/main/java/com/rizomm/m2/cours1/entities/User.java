package com.rizomm.m2.cours1.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class User {

    public String firstName;
    public String lastName;
    public String mail;

}
