package gr.haec.fullstack.VisitCrete.Services;

import gr.haec.fullstack.VisitCrete.Entities.Person;

import java.util.List;

public interface PersonService {

    List<Person> findByName(String name);
    List<Person> findAll();
    List<Person> findByNameContaining(String searchTerm);
    Person getUserById(Long id);
    Person save(Person user);
    void delete(Long id);
    void delete(Person user);
}
