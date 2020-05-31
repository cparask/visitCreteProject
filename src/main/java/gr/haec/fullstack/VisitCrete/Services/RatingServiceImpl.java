package gr.haec.fullstack.VisitCrete.Services;


import gr.haec.fullstack.VisitCrete.Entities.Rating;
import gr.haec.fullstack.VisitCrete.Entities.TourPackage;
import gr.haec.fullstack.VisitCrete.Repositories.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    RatingRepository ratingRepository;


    /*@Override
    public List<TourPackage> findAllByRatings(String score) {
        return ratingRepository.findAllByRatings(score);
    }*/
}
