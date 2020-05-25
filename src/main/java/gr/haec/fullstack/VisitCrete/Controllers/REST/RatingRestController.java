package gr.haec.fullstack.VisitCrete.Controllers.REST;

import gr.haec.fullstack.VisitCrete.Services.RatingService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingRestController {

    RatingService ratingService;

    public RatingRestController(RatingService ratingService) {
        this.ratingService = ratingService;
    }
}
