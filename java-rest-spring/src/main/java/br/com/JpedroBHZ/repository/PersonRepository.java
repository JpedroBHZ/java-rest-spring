package br.com.JpedroBHZ.repository;

import br.com.JpedroBHZ.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
