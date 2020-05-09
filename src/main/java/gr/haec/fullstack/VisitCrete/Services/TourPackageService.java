package gr.haec.fullstack.VisitCrete.Services;

import gr.haec.fullstack.VisitCrete.Entities.TourPackage;

import java.util.List;
import java.util.Optional;

public interface TourPackageService {

    List < TourPackage > findAll();
    TourPackage save(TourPackage tourPackage);
    TourPackage findByTourPackageId(Long tourPackageid);
    void delete(long tourPackageid);

}
