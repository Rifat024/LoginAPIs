 package com.example.LoginAPI.Repository;

import com.example.LoginAPI.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    //public Person person = null;
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id= UUID.randomUUID();
        return insertPerson(id,person);
    }
    List<Person> getPersonList();
    Optional<Person>getPersonListById(UUID id);
    int updatePersonById(UUID id, Person person);
    int deletePersonById(UUID id);
}
