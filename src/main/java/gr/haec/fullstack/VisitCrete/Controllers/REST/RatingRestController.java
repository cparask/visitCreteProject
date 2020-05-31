package gr.haec.fullstack.VisitCrete.Controllers.REST;

import gr.haec.fullstack.VisitCrete.Entities.TourPackage;
import gr.haec.fullstack.VisitCrete.Services.RatingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingRestController {

    RatingService ratingService;

    public RatingRestController(RatingService ratingService) {
        this.ratingService = ratingService;
    }


    @GetMapping (path = "rest/tour-package/rating/{score}")
    List<TourPackage> getTourPackageByRating (@PathVariable String score) {
        List<TourPackage> tourPackageByRating = ratingService.findAllByRatings(score);
        return tourPackageByRating;
    }

}
