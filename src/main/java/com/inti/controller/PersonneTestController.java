package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Enseignant;
import com.inti.entities.Etudiant;
import com.inti.entities.Personne;
import com.inti.service.interfaces.IPersonneTestService;

@RestController
@CrossOrigin
public class PersonneTestController {
	
	@Autowired
	IPersonneTestService personneTestService;
	
	@GetMapping("/enseignants/{type}")
	public List<Enseignant> listeEnseignants() {
		return personneTestService.listeEnseignants();
	}
	
	@GetMapping("/etudiants/{type}")
	public List<Etudiant> listeEtudiants() {
		return personneTestService.listeEtudiants();
	}
	
	@GetMapping("/personnes/{username}")
	public Etudiant findOne(String username) {
		return personneTestService.findByUsername(username);
	}
}
