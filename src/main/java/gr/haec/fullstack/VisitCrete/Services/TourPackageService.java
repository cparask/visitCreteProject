package gr.haec.fullstack.VisitCrete.Services;

import gr.haec.fullstack.VisitCrete.Entities.TourPackage;

import java.util.List;

public interface TourPackageService {

    List < TourPackage > findAll();
    TourPackage save(TourPackage tourPackage);
    TourPackage findByTourPackageId(Long tourPackageid);
    List<TourPackage> findAllByRatings(String score);
    void delete(long tourPackageid);

}
