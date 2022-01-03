package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Beruf;
import ch.zhaw.springboot.repositories.BerufRepository;



@RestController
public class BerufRestController {

	
	@Autowired
	BerufRepository repository;
	
	@RequestMapping(value = "rezeptChecker/beruf", method = RequestMethod.GET)
	public List<Beruf> getAll() {
		return this.repository.findAll();
	} 
	
	
	@PostMapping("/beruf")
	Beruf newBeruf(@RequestBody Beruf newBeruf) {
		return repository.save(newBeruf);
	}
	
	} 
	


	
	
