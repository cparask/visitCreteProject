package gr.haec.fullstack.VisitCrete.Controllers;


import gr.haec.fullstack.VisitCrete.CustomError;
import gr.haec.fullstack.VisitCrete.Entities.Person;
import gr.haec.fullstack.VisitCrete.Services.PersonService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonRestController {

    PersonService personService;


    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/rest/users/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Person> getUsersList() {
        List<Person> allUsers = personService.findAll();
        return allUsers;
    }

    @RequestMapping(value = "/rest/users/list/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Person getUserById(@PathVariable Long id) {

       // if ( personService.getUserById(id).equals(false)) {
            Person singleUser = personService.getUserById(id);
            return singleUser;
        //} else {
          //  CustomError error = new CustomError(1, "wrong id", "The user with id " + id + " does not exist");
       // }

       // Μου βγάζει error γιατί ζητάει να επιστρέψει κάτι μετά το else
    }


// Need to implement check logic
        @PostMapping("/rest/create-user")
        public Person createUser (@RequestBody Person p) {
           Person newUser = personService.save(p);
            return newUser;

    }
    // Need to implement check logic
    @DeleteMapping("/rest/delete-user/{id}")
    public void deleteUser (@PathVariable long id) {
        personService.delete(id);

    }
}
