package com.sandeep.userservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel{

    private String name;
    private String email;
    private String hashedPassword;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Role> roles;
    private boolean isEmailVerified;
}