package gr.haec.fullstack.VisitCrete.Controllers.REST;

import gr.haec.fullstack.VisitCrete.Entities.Person;
import gr.haec.fullstack.VisitCrete.Entities.TourPackage;
import gr.haec.fullstack.VisitCrete.Services.TourPackageService;
import gr.haec.fullstack.VisitCrete.Services.TourPackageServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class TourPackageRestController {

    TourPackageService tourPackageService;

    public TourPackageRestController(TourPackageService tourPackageService) {
        this.tourPackageService = tourPackageService;
    }

    @GetMapping(path = "rest/tour-packages/list")
    public List<TourPackage> getAllTourPackages() {
        List<TourPackage> allTourPackages = tourPackageService.findAll();

        return allTourPackages;

    }

    @GetMapping (path = "rest/tour-packages/{id}")
    public ResponseEntity getTourPackage (@PathVariable long tourPackageid) {
        return new ResponseEntity(tourPackageService.findByTourPackageId(tourPackageid), HttpStatus.OK);
    }


    @PostMapping("/rest/create-tour-package")
    public TourPackage createTourPackage(@RequestBody TourPackage tourPackage) {
        TourPackage newTourPackage = tourPackageService.save(tourPackage);
        return newTourPackage;

    }

    @DeleteMapping("/rest/delete-tour-package/{id}")
    public void deleteTourPackage(@PathVariable long tourPackageid) {
        tourPackageService.delete(tourPackageid);
    }


    @GetMapping (path="rest/tour-package/{score}")
    public List<TourPackage> getAllByRating(@PathVariable String score) {
        List<TourPackage> tourPackageByRating = tourPackageService.findAllByRatings(score);
        return tourPackageByRating;

    }

}
