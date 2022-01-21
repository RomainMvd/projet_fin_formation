package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.entities.Cours;
import com.inti.service.interfaces.ICoursService;

@RestController
@CrossOrigin
public class CoursController {

	@Autowired
	ICoursService coursServ;

	@RequestMapping(value = "cours", method = RequestMethod.GET)
	public List<Cours> findAll() {
		return coursServ.findAll();
	}

	@RequestMapping(value = "cours/{chap}", method = RequestMethod.GET)
	public Cours findByNomCours(@PathVariable("chap") String nomCours) {
		return coursServ.findByNomCours(nomCours);
	}

	@RequestMapping(value = "cours", method = RequestMethod.POST)
	public String saveCours(@RequestParam(name = "nomCours", required = false) String nomCours,
			@RequestParam(name = "nbrHeure", required = false) Double nbrHeure,
			@RequestParam(name = "fichierCours", required = false) MultipartFile fichierCours) {
		try {
			Cours currentCours = new Cours();
			currentCours.setNomCours(nomCours);
			currentCours.setNbrHeure(nbrHeure);
			if (fichierCours != null) {
				currentCours.setFichierCours(fichierCours.getBytes());
			}
			coursServ.save(currentCours);
			return "File uploaded successfully! filename=" + fichierCours.getOriginalFilename();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Fail!";
		}
	}

	@RequestMapping(value = "cours/{idC}", method = RequestMethod.DELETE)
	public void deleteEmp(@PathVariable("idC") Long idCours) {
		coursServ.delete(idCours);
	}

	@RequestMapping(value = "cours/{idC}", method = RequestMethod.PUT)
	public Cours updateEmp(@PathVariable("idC") Long idCours, @RequestBody Cours cours) {
		Cours currentCours = coursServ.findOne(idCours);
		currentCours.setNomCours(cours.getNomCours());
		currentCours.setNbrHeure(cours.getNbrHeure());
		currentCours.setFichierCours(cours.getFichierCours());
		return coursServ.save(currentCours);

	}

}
