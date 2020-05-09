package gr.haec.fullstack.VisitCrete.Controllers;

import gr.haec.fullstack.VisitCrete.Entities.Person;
import gr.haec.fullstack.VisitCrete.Entities.TourPackage;
import gr.haec.fullstack.VisitCrete.Services.TourPackageService;
import gr.haec.fullstack.VisitCrete.Services.TourPackageServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class TourPackageRestController {

    TourPackageService tourPackageService;

    public TourPackageRestController(TourPackageService tourPackageService) {
        this.tourPackageService = tourPackageService;
    }

    @RequestMapping(value = "/rest/tour-packages/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<TourPackage> getTourPackagesList() {
        List<TourPackage> allTourPackages = tourPackageService.findAll();
        return allTourPackages;
    }


    // βγάζει Null pointer exception
    @RequestMapping(value = "/rest/tour-packages/list/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    TourPackage getTourPackageById(@PathVariable Long tourPackageid) {

        TourPackage singleTourPackage = tourPackageService.findByTourPackageId(tourPackageid);
        return singleTourPackage;

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
}
