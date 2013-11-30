package pb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pb.model.Person;

@Controller
public class FirstController {
	
	@RequestMapping(value="/getPersons", method = RequestMethod.GET)
	public @ResponseBody List<Person> getPersons() {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Poornima", "Female"));
		persons.add(new Person("Badari", "Male"));
		return persons;
	}
	
}
