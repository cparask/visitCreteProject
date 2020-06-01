package gr.haec.fullstack.VisitCrete.Services;

import gr.haec.fullstack.VisitCrete.Entities.TourPackage;
import gr.haec.fullstack.VisitCrete.Repositories.TourPackageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourPackageServiceImpl implements TourPackageService {

    
    private final TourPackageRepository tourPackageRepository;


    public TourPackageServiceImpl(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }


    @Override
    public List<TourPackage> findAll() {
        return tourPackageRepository.findAll();
    }

    @Override
    public TourPackage save(TourPackage tourPackage) {
        return tourPackageRepository.save(tourPackage);

    }

    @Override
    public TourPackage findByTourPackageId(Long tourPackageid) {
        return tourPackageRepository.findByTourPackageid(tourPackageid);
    }

    @Override
    public List<TourPackage> findAllByRatings(String score) {
       return tourPackageRepository.findAllByRatings(score);
    }




    @Override
    public void delete(long tourPackageid) {
       tourPackageRepository.deleteById(tourPackageid);

    }
}
