package com.example.LoginAPI.service;

import com.example.LoginAPI.Repository.PersonRepository;
import com.example.LoginAPI.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    public final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public Person addPerson(Person person){
       return personRepository.save(person);
    }
    public List<Person> addPersons(List<Person> person){
        return personRepository.saveAll(person);
    }
    public List<Person> getPersonList(){
        return personRepository.findAll();
    }
    public Person getPersonById(int id){
        return personRepository.findById(id).orElse(null);
    }
    public Person updatePerson( int id,Person person){
       Person existPerson= personRepository.findById(id).orElse(null);
       existPerson.setId(person.getId());
       existPerson.setName(person.getName());
       existPerson.setPassword(person.getPassword());
       return personRepository.save(existPerson);
    }
    public String deletePerson(int id){
         personRepository.existsById(id);
         return "Removed Peron Info!!"+id;
    }


}
