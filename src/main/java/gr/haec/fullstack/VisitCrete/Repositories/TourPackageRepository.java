package gr.haec.fullstack.VisitCrete.Repositories;


import gr.haec.fullstack.VisitCrete.Entities.Rating;
import gr.haec.fullstack.VisitCrete.Entities.TourPackage;
import gr.haec.fullstack.VisitCrete.Services.TourPackageServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface TourPackageRepository extends JpaRepository<TourPackage, Long> {

    List < TourPackage > findAll();
    TourPackage findByTourPackageid(Long tourPackageid);
    List<TourPackage> findAllByRatings(String score );




}
