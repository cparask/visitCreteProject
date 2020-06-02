package gr.haec.fullstack.VisitCrete.Services;


import gr.haec.fullstack.VisitCrete.Entities.Rating;
import gr.haec.fullstack.VisitCrete.Entities.TourPackage;
import gr.haec.fullstack.VisitCrete.Repositories.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    RatingRepository ratingRepository;

    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }


    @Override
    public List<TourPackage> findAllByScore(String score) {
        return ratingRepository.findAllByScore(score);
    }
}
