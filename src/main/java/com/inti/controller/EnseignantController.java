package com.inti.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Enseignant;
import com.inti.service.interfaces.IEnseignantService;

@RestController
@CrossOrigin
public class EnseignantController {

	@Autowired
	IEnseignantService enseignantService;
	
	// BASIC FUNCTION
	
	@GetMapping("/enseignants")
	public List<Enseignant> findAll() {
		return enseignantService.findAll();
	}
	
	@GetMapping("/enseignants/{idE}")
	public Enseignant findOne(@PathVariable("idE") Long idEnseignant) {
		return enseignantService.findOne(idEnseignant);
	}
	
	@GetMapping("/enseignants/{username}")
	public Enseignant findOne(@PathVariable("username") String username) {
		return enseignantService.findByUsername(username);
	}
	
	
	@PostMapping("/enseignants")
	public String saveEnseignant(@RequestParam(name = "nomEnseignant", required = false) String nomEnseignant, @RequestParam(name = "prenomEnseignant", required = false) String prenomEnseignant,
			@RequestParam(name = "username", required = false) String username, @RequestParam(name="password", required = false) String password, @RequestParam(name = "moyenne", required = false) double salaire,
			@RequestParam(name = "dateNaissanceEnseignant", required = false) Date dateNaissance, @RequestParam(name = "emailEnseignant", required = false) String emailEnseignant) {
		try {
			Enseignant currentEnseignant = new Enseignant();
			currentEnseignant.setNomPersonne(nomEnseignant);
			currentEnseignant.setPrenomPersonne(prenomEnseignant);
			currentEnseignant.setUsername(username);
			currentEnseignant.setPassword(password);
			currentEnseignant.setSalaire(salaire);
			currentEnseignant.setDateNaissance(dateNaissance);
			currentEnseignant.setEmail(emailEnseignant);
			return "Enseignant uploaded";
		}catch(Exception ex) {
			ex.printStackTrace();
			return "Error";
		}
	}
	
	@PutMapping("/enseignants/{idE}")
	public Enseignant updateEnseignant(@PathVariable("idE") Long idEnseignant, @RequestBody Enseignant enseignant) {
		Enseignant currentEnseignant = enseignantService.findOne(idEnseignant);
		currentEnseignant.setNomPersonne(enseignant.getNomPersonne());
		currentEnseignant.setPrenomPersonne(enseignant.getPrenomPersonne());
		currentEnseignant.setUsername(enseignant.getUsername());
		currentEnseignant.setPassword(enseignant.getPassword());
		currentEnseignant.setSalaire(enseignant.getSalaire());
		currentEnseignant.setDateNaissance(enseignant.getDateNaissance());
		currentEnseignant.setEmail(enseignant.getEmail());
		currentEnseignant.setMatieres(enseignant.getMatieres());
		currentEnseignant.setRoles(enseignant.getRoles());
		currentEnseignant.setClasse(enseignant.getClasse());
		return enseignantService.save(currentEnseignant);
	}
	
	@DeleteMapping("/enseignants/{idE}")
	public void deleteEnseignant(@PathVariable("idE") Long idEnseignant) {
		enseignantService.delete(idEnseignant);
	}
	
}
