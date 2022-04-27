package com.example.LoginAPI.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity(name = "person")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false,unique = true)
    private int id;
    @NotBlank
    @Column(name = "name",nullable = false,columnDefinition = "TEXT")
    private   String name;
    @NotBlank
    @Column(name = "password",nullable = false,columnDefinition = "TEXT")
    private  String password;

    public Person (@JsonProperty("name") String name,
                  @JsonProperty("password") String password) {
        this.name = name;
        this.password = password;
    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
