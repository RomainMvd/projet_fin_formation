package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Examen;
import com.inti.service.interfaces.IExamenService;

@RestController
@CrossOrigin
public class ExamenController {
	@Autowired
	IExamenService examenService;
	
	@RequestMapping(value = "examens", method = RequestMethod.GET)
	public List<Examen> findAll() {
		return examenService.findAll();
	}

	@RequestMapping(value = "examens/{nomExamen}", method = RequestMethod.GET)
	public Examen findOne(@PathVariable("nomExamen") Long nomExamen) {
		return examenService.findOne(nomExamen);
	}

	@RequestMapping(value = "examens", method = RequestMethod.POST)
	public Examen saveExamen(@RequestBody Examen examen) {
		return examenService.save(examen);
	}

	@RequestMapping(value = "examens/{idExamen}", method = RequestMethod.DELETE)
	public void deleteExamen(@PathVariable("idExamen") Long idExamen) {
		examenService.delete(idExamen);
	}

	@RequestMapping(value = "examens/{nomExamen}", method = RequestMethod.PUT)
	public Examen updateExamen(@PathVariable("nomExamen") Long nomExamen, @RequestBody Examen examen) {
		Examen currentExamen = examenService.findOne(nomExamen);
		currentExamen.setNomExamen(examen.getNomExamen());
		return examenService.save(currentExamen);
	}

}
