package gr.haec.fullstack.VisitCrete.Controllers;

import gr.haec.fullstack.VisitCrete.Entities.Tour;
import gr.haec.fullstack.VisitCrete.Repositories.TourRepository;
import gr.haec.fullstack.VisitCrete.ResourceNotFoundException;
import gr.haec.fullstack.VisitCrete.Services.TourService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RestController
public class TourRestController {

    TourService tourService;
    TourRepository tourRepository;

    public TourRestController(TourService tourService) {
        this.tourService = tourService;
    }

    @RequestMapping(value = "/rest/tours/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Tour> getTourList() {
        List<Tour> allTours = tourService.findAll();
        return allTours;
    }

    @RequestMapping(value = "/rest/tours/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Tour getTourById(@PathVariable Long id) {
        Tour oneTour = tourService.getTourById(id);
        return oneTour;
    }

    /*@RequestMapping (value = "/rest/tour/update/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity updateTour (@PathVariable Long id,
                    @RequestBody Tour tourDetails) throws ResourceNotFoundException {
            Tour tourToUpdate = tourService.getTourById(id);
                    new ResourceNotFoundException("Tour not found for this id :: " + id);
            tourToUpdate.setPrice(tourDetails.getPrice());
            tourToUpdate.setDuration(tourDetails.getDuration());
            tourToUpdate.setTitle(tourDetails.getTitle());
            final Tour updatedTour = tourRepository.save(tourToUpdate);
            return new ResponseEntity(tourService.updateTour(updatedTour), HttpStatus.OK);
        }*/


    }



