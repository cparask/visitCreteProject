package gr.haec.fullstack.VisitCrete.Controllers;


import gr.haec.fullstack.VisitCrete.Entities.Person;
import gr.haec.fullstack.VisitCrete.Services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonControllerMVC {
    private PersonService personService;

    public PersonControllerMVC(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/user/view", method = RequestMethod.GET)
    public ModelAndView viewPerson(@ModelAttribute("user") Person user) {
        return new ModelAndView("user/view", "user", user);
    }

}
