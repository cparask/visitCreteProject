package gr.haec.fullstack.VisitCrete.Controllers.REST;
import gr.haec.fullstack.VisitCrete.Entities.Tour;
import gr.haec.fullstack.VisitCrete.Repositories.TourRepository;
import gr.haec.fullstack.VisitCrete.ResourceNotFoundException;
import gr.haec.fullstack.VisitCrete.Services.TourService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;



@RestController
public class TourRestController {


    TourService tourService;


    public TourRestController(TourService tourService) {
        this.tourService = tourService;
    }
// Null pointer exception
    /*@RequestMapping(value = "/rest/tours/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Tour> getTourList() {
        List<Tour> allTours = tourService.findAll();
        return allTours;
    }*/

    @GetMapping (path = "rest/tours/list")
    public List<Tour> getAllTours () {
        List<Tour> allTours = tourService.findAll();
        return allTours;
    }

    @RequestMapping(value = "/rest/tours/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Tour getTourById(@PathVariable Long id) {
        Tour oneTour = tourService.getTourById(id);
        return oneTour;
    }



    }



