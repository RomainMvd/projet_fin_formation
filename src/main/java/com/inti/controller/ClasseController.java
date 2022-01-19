package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Classe;
import com.inti.service.interfaces.IClasseService;

@RestController
@CrossOrigin
public class ClasseController {
	@Autowired
	IClasseService classeService;

	@RequestMapping(value = "classes", method = RequestMethod.GET)
	public List<Classe> findAll() {
		return classeService.findAll();
	}

	@RequestMapping(value = "classes/{idC}", method = RequestMethod.GET)
	public Classe findOne(@PathVariable("idC") Long idClasse) {
		return classeService.findOne(idClasse);
	}

	@RequestMapping(value = "classes/{idC}/{nomC}", method = RequestMethod.GET)
	public Classe findByIdAndNom(@PathVariable("idC") Long idClasse, @PathVariable("nomC") String nomClasse) {
		return classeService.findByIdAndNom(idClasse, nomClasse);
	}

	@RequestMapping(value = "classes", method = RequestMethod.POST)
	public Classe saveClasse(@RequestBody Classe classe) {
		return classeService.save(classe);
	}

	@RequestMapping(value = "classes/{idC}", method = RequestMethod.PUT)
	public Classe updateClasse(@PathVariable("idC") Long idClasse, @RequestBody Classe classe) {
		Classe currentClasse = classeService.findOne(idClasse);
		currentClasse.setNomClasse(classe.getNomClasse());
		return classeService.save(currentClasse);
	}

	@RequestMapping(value = "classes/{idC}", method = RequestMethod.DELETE)
	public void deleteClasse(@PathVariable("idC") Long idClasse, @RequestBody Classe classe) {
		classeService.delete(idClasse);
	}
}
