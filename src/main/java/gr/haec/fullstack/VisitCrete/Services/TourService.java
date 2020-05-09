package gr.haec.fullstack.VisitCrete.Services;

import gr.haec.fullstack.VisitCrete.Entities.Tour;

import java.util.List;
import java.util.Optional;

public interface TourService {
    List<Tour> findByTitle(String title);
    List<Tour> findAll ();
    List<Tour> findByTitleContaining(String searchTerm);
    List<Tour> findByTourPackageName (String name);
    Tour getTourById(Long id);
    Tour save(Tour tour);
    void delete(Long id);
    void delete(Tour tour);
    Optional<Tour> findByTourPackageId (Long tourPackageid);
}
