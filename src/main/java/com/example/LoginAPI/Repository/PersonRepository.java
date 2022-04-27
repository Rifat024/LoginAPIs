package com.example.LoginAPI.Repository;

import com.example.LoginAPI.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {


}
