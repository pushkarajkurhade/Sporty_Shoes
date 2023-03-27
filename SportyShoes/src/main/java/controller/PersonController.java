package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.example.PersonEntity;

import service.PersonService;

@RestController
@RequestMapping(path="/webapi")
public class PersonController {
	
	//REST Client  - PostMan
	//PostMan (REST Client) --> Controller --> Service --> Repository --> Entity --> Database
	
	@Autowired
    PersonService personService;
	
	@RequestMapping("/allPerson") // URL --> http://localhost:8080/webapi/allPerson
    public List<PersonEntity> getAllPerson()
    {
    	return personService.getAllPerson();
    }
	
	@RequestMapping("/Person/{id}") // URL --> http://localhost:8080/webapi/Person/11
    public PersonEntity getPerson(@PathVariable int id)
    {
    	return personService.getPerson(id);
    }
	
	@RequestMapping(method=RequestMethod.POST, value="/Person")   // URL --> http://localhost:8080/webapi/Person
    public void addPerson(@RequestBody PersonEntity pe ) {
        personService.addPerson(pe);
    }
	
	@RequestMapping(method=RequestMethod.PUT, value="/Person/{id}") // URL --> http://localhost:8080/webapi/Person/11
    public void updatePerson(@PathVariable int id, @RequestBody PersonEntity pe ) {
        personService.updatePerson(id, pe);
    }   

    @RequestMapping(method=RequestMethod.DELETE, value="/Person/{id}") // URL --> http://localhost:8080/webapi/Person/11
    public void deletePerson(@PathVariable int id)  {
        personService.deletePerson(id);
    }   


}
