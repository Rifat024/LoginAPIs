package com.example.LoginAPI.controller;

import com.example.LoginAPI.model.Person;
import com.example.LoginAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    public final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @PostMapping
    public List<Person> addPersons(@Valid @NonNull @RequestBody List<Person> person){
        return personService.addPersons(person);
    }
    @GetMapping
    public List<Person> getPersonList(){
        return personService.getPersonList();
    }

    @GetMapping(path = "id={id}")
    public Person getPersonById(@PathVariable int id){
        return personService.getPersonById(id);
    }

    @PutMapping(path = "id={id}")
    public  void updatePerson(@PathVariable int id,@Valid @NonNull @RequestBody Person person){
        personService.updatePerson(id,person);
    }

    @DeleteMapping(path = "id={id}")
    public  void deletePerson(@PathVariable int id){
        personService.deletePerson(id);
    }
}
