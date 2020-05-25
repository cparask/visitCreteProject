package gr.haec.fullstack.VisitCrete.Controllers.MVC;


import gr.haec.fullstack.VisitCrete.Services.PersonService;
import org.springframework.stereotype.Controller;

@Controller
public class PersonControllerMvc {

    private PersonService personService;

    public PersonControllerMvc(PersonService personService) {
        this.personService = personService;
    }


}
