package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Matiere;
import com.inti.service.interfaces.IMatiereService;

@RestController
@CrossOrigin
public class MatiereController {
	@Autowired
	IMatiereService matiereService;
	
	@RequestMapping(value = "matieres", method = RequestMethod.GET)
	public List<Matiere> findAll() {
		return matiereService.findAll();
	}

	@RequestMapping(value = "matieres/{nomMatiere}", method = RequestMethod.GET)
	public Matiere findOne(@PathVariable("nomMatiere") Long nomMatiere) {
		return matiereService.findOne(nomMatiere);
	}

	@RequestMapping(value = "matieres", method = RequestMethod.POST)
	public Matiere saveMatiere(@RequestBody Matiere matiere) {
		return matiereService.save(matiere);
	}

	@RequestMapping(value = "matieres/{idMatiere}", method = RequestMethod.DELETE)
	public void deleteMatiere(@PathVariable("idMatiere") Long idMatiere) {
		matiereService.delete(idMatiere);
	}

	@RequestMapping(value = "matieres/{nomMatiere}", method = RequestMethod.PUT)
	public Matiere updateMatiere(@PathVariable("nomMatiere") Long nomMatiere, @RequestBody Matiere matiere) {
		Matiere currentMatiere = matiereService.findOne(nomMatiere);
		currentMatiere.setNomMatiere(matiere.getNomMatiere());
		return matiereService.save(currentMatiere);
	}
}
