package cl.blog.restservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestService {
	
	@RequestMapping(value="/person/list", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> listPersons(){
		
		List<Person> listPerson = new ArrayList<Person>();
		Person p1 = new Person("John", "Garcia", "john.garcia@mail.com", 0);
		Person p2 = new Person("Josh", "Home", "josh.home@mail.com", 0);
		Person p3 = new Person("Alfredo", "Hernandez", "alfredo.hernandez@mail.com", 0);
		
		listPerson.add(p1);
		listPerson.add(p2);
		listPerson.add(p3);
		
		return listPerson;
	}
	
	@RequestMapping(value="/person/add/list", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> listPersonsAddParam(@RequestBody Person person){
		
		List<Person> listPerson = new ArrayList<Person>();
		Person p1 = new Person("John", "Garcia", "john.garcia@mail.com", 0);
		Person p2 = new Person("Josh", "Home", "josh.home@mail.com", 0);
		Person p3 = new Person("Alfredo", "Hernandez", "alfredo.hernandez@mail.com", 0);
		
		listPerson.add(p1);
		listPerson.add(p2);
		listPerson.add(p3);
		listPerson.add(person);
		
		return listPerson;
	}
	
	@RequestMapping(value="/person/set/state/{state}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person setStatePerson(@PathVariable Integer state){
		
		Person person = new Person("John", "Garcia", "john.garcia@mail.com", state);
		
		return person;
	}

}

