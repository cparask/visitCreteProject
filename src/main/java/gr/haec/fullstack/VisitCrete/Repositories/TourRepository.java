package gr.haec.fullstack.VisitCrete.Repositories;

import gr.haec.fullstack.VisitCrete.Entities.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TourRepository extends JpaRepository<Tour, Long> {

    List<Tour> findByTitle(String title);
    List<Tour> findAll ();
    List<Tour> findByTitleContaining(String searchTerm);
    Optional<Tour> findById (Long tourPackageid);
    List<Tour> findByTourPackageName (String name);


}
