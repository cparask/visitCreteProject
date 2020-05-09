package gr.haec.fullstack.VisitCrete.Services;


import gr.haec.fullstack.VisitCrete.Entities.Person;
import gr.haec.fullstack.VisitCrete.Repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findByName(String name) {
        return personRepository.findByName(name);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> findByNameContaining(String searchTerm) {
        return personRepository.findByNameContaining(searchTerm);
    }

    @Override
    public Person getUserById(Long id) {
        return personRepository.findById(id).get();
    }


    @Override
    public Person save(Person user) {
        return personRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public void delete(Person user) {
        personRepository.delete(user);

    }
}
