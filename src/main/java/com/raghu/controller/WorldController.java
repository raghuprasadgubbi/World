package com.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.eo.Country;
import com.raghu.processor.WorldProcessor;
import com.raghu.repository.WorldRepository;

@RestController
@RequestMapping("/world")
public class WorldController {
	
	@Autowired
	WorldProcessor worldProcessor;
	
	@Autowired
	WorldRepository repository;

	@GetMapping(path="/countries", produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Country> getCountries() {
		return repository.findAll();
	}
	
	@GetMapping(path="/countries/{ctyCode}")
	public ResponseEntity<Country> getCountriesByCountryCode(@PathVariable String ctyCode) {
		Country cty =  repository.findById(ctyCode).get();
		
		ResponseEntity<Country> response = new ResponseEntity<Country>(cty, HttpStatus.OK);
		return response;
	}
	
	@PostMapping(path="/countries")
	public ResponseEntity<Country> createCountry(@RequestBody Country cty) {
		
		try {
			repository.save(cty);
		} catch(Exception e) {
			System.out.println("Error while creating country...");
			e.printStackTrace();
			return new ResponseEntity<Country>(cty,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Country>(cty,HttpStatus.OK);
		
	}
	
	@DeleteMapping(path="/countries")
	public String deleteCountry(@RequestBody Country cty) {
		repository.delete(cty);
		return "Record Deleted";
	}
	
	/*@PostMapping(path="/countries")
	public ResponseEntity<Country> updateCountry(@RequestBody Country cty) {
		repository.save(cty);
		return new ResponseEntity<Country>(cty,HttpStatus.OK);
	}*/
	
	
}
