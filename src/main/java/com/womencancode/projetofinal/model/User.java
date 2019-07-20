package com.womencancode.projetofinal.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data

public class User {
    private String name;
    private String lastName;
    private String username;
    private String email;
    private String role;
    private String id;
    private Date birthDate;

    public User(String name, String lastName, String username, String email, String role, String id, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.id = id;
        this.birthDate = birthDate;

    }

}
