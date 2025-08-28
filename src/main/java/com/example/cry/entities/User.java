package com.example.cry.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name="user")
@Table(name="users")
@Getter
@Setter
public class User {
    @Id
    private String userid;
    @Column(name="user_name",nullable=false)
    private String username;
    @Column(unique = true,nullable=false)
    private String password;
    @Column(nullable=false,unique=true)
    private String email;
    @Column(length = 1000)
    private String about;
    private String profilepic;


    private boolean enabled=false;
    private boolean emailverified=false;
    private boolean phoneverified=false;


    private Providers providers=Providers.SELF;
    private String providerid;

    //cascad matlab agar user delete ho sara contet delte ho jaya
    //fatch= jab tak contact ki zarurat nahi pdha gi tab tak query nahi chala gi contact ki user hi show hoga

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Contact> contacts=new ArrayList<>();

}
