package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Personne;
import com.inti.service.interfaces.IPersonneService;

@RestController
@CrossOrigin
public class PersonneController {
	
	@Autowired
	IPersonneService personneService;
	
	// BASIC FUNCTION
	
	@GetMapping("/personnes")
	public List<Personne> findAll() {
		return personneService.findAll();
	}
	
}
