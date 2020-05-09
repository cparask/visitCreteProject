package gr.haec.fullstack.VisitCrete.Repositories;

import gr.haec.fullstack.VisitCrete.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {

    List<Person> findByName(String name);
    List<Person> findByNameContaining(String searchTerm);

}
