package com.example.LoginAPI.Repository;

import com.example.LoginAPI.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, Integer> {


}
