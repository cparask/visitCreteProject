package gr.haec.fullstack.VisitCrete.Controllers.MVC;


import gr.haec.fullstack.VisitCrete.Entities.TourPackage;
import gr.haec.fullstack.VisitCrete.Services.TourPackageService;
import gr.haec.fullstack.VisitCrete.Services.TourService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControllerMvc {

    public IndexControllerMvc() {

    }

    @GetMapping({"/", "/index"})
    public String welcomePage (Model model) {
        model.addAttribute("message", "Welcome to our application");
        return "index";
    }
}
