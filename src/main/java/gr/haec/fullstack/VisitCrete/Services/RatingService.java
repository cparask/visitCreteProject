package gr.haec.fullstack.VisitCrete.Services;

import gr.haec.fullstack.VisitCrete.Entities.Rating;
import gr.haec.fullstack.VisitCrete.Entities.TourPackage;

import java.util.List;

public interface RatingService {

    List<TourPackage> findAllByScore(String score );
    
}
