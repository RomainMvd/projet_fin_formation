package com.inti.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
	public String saveExamen(@RequestParam(name = "nomExamen", required = false) String nomExamen,
			@RequestParam(name = "dateExamen", required = false) Date dateExamen,
			@RequestParam(name = "duree", required = false) String duree,
			@RequestParam(name = "fichierExamen", required = false) MultipartFile fichierExamen) {
		try {
			Examen currentExam = new Examen();
			currentExam.setNomExamen(nomExamen);
			currentExam.setDateExamen(dateExamen);
			currentExam.setDuree(duree);
			if (fichierExamen != null) {
				currentExam.setFichierExamen(fichierExamen.getBytes());
			}
			// currentExam.setFichierExamen(fichierExamen.getBytes());
			examenService.save(currentExam);
			return "File uploaded successfully! filename=" + fichierExamen.getOriginalFilename();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Fail!";
		}
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
