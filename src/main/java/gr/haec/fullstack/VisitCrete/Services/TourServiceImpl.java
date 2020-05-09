package gr.haec.fullstack.VisitCrete.Services;


import gr.haec.fullstack.VisitCrete.Entities.Tour;
import gr.haec.fullstack.VisitCrete.Repositories.TourRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourServiceImpl implements TourService {
    TourRepository tourRepository;


    @Override
    public List<Tour> findByTitle(String title) {
        return tourRepository.findByTitle(title);
    }

    @Override
    public List<Tour> findAll() {
        return tourRepository.findAll();
    }

    @Override
    public List<Tour> findByTitleContaining(String searchTerm) {
        return tourRepository.findByTitleContaining(searchTerm);
    }

    @Override
    public Optional<Tour> findByTourPackageId(Long tourPackageid) {
        return tourRepository.findById(tourPackageid);
    }

    @Override
    public List<Tour> findByTourPackageName(String name) {
        return tourRepository.findByTourPackageName(name);
    }

    @Override
    public Tour getTourById(Long id) {
        return tourRepository.findById(id).orElse(null);
    }

    @Override
    public Tour save(Tour tour) {
        return tourRepository.save(tour);
    }


    @Override
    public void delete(Long id) {
        tourRepository.deleteById(id);

    }

    @Override
    public void delete(Tour tour) {
        tourRepository.delete(tour);

    }
}
