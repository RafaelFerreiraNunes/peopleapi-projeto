package com.projetos.peopleapiprojeto.repository;

import com.projetos.peopleapiprojeto.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
