package com.example.LoginAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "person")
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, unique = true)
    private int id;
    @NotBlank
    @Column(name = "name", nullable = false, columnDefinition = "TEXT")
    private String name;
    @NotBlank
    @Column(name = "password", nullable = false, columnDefinition = "TEXT")
    private String password;

    public Person(@JsonProperty("name") String name,
                  @JsonProperty("password") String password) {
        this.name = name;
        this.password = password;
    }

    public Person() {

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
