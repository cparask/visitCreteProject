package gr.haec.fullstack.VisitCrete.Repositories;


import gr.haec.fullstack.VisitCrete.Entities.Rating;
import gr.haec.fullstack.VisitCrete.Entities.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {


    List<TourPackage> findAllByRatings(String score );


}
