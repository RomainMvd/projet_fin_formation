package com.inti.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Cours;
import com.inti.service.interfaces.ICoursService;

@RestController
public class CoursController {
	
	ICoursService coursServ;
	
	@RequestMapping(value = "cours", method = RequestMethod.GET)
	public List<Cours> findAll(){
		return coursServ.findAll();
	}

	@RequestMapping (value = "cours/{chap}", method = RequestMethod.GET)
	public Cours findByNomAndPrenom (@PathVariable("chap") String chapitre) {
		return coursServ.findByChapitre(chapitre);
	}
	
	@RequestMapping (value = "cours", method = RequestMethod.POST)
	public Cours saveCours (@RequestBody Cours cours) {
		return coursServ.save(cours);
	}
	
	@RequestMapping (value = "cours/{idC}", method = RequestMethod.DELETE)
	public void deleteEmp (@PathVariable("idC") Long idCours) {
		coursServ.delete(idCours);
	}
	
	@RequestMapping (value = "employes/{idC}", method = RequestMethod.PUT)
	public Cours updateEmp (@PathVariable("idC") Long idCours, @RequestBody Cours cours) {
		Cours currentCours = coursServ.findOne(idCours);
		currentCours.setChapitre(cours.getChapitre());
		currentCours.setNbrHeure(cours.getNbrHeure());
		currentCours.setFichierCours(cours.getFichierCours());
		return coursServ.save(currentCours);
	}

}
