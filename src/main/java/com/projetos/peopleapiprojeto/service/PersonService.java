package com.projetos.peopleapiprojeto.service;

import com.projetos.peopleapiprojeto.dto.MessageResponseDTO;
import com.projetos.peopleapiprojeto.entity.Person;
import com.projetos.peopleapiprojeto.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create person with Id " + savedPerson.getId())
                .build();
    }
}
