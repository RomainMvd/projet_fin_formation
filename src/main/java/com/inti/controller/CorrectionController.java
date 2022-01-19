package com.inti.controller;

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

import com.inti.entities.Correction;
import com.inti.service.interfaces.ICorrectionService;

@RestController
@CrossOrigin
public class CorrectionController {

	@Autowired
	ICorrectionService correctionService;

	@RequestMapping(value = "corrections", method = RequestMethod.GET)
	public List<Correction> findAll() {
		return correctionService.findAll();
	}

	@RequestMapping(value = "corrections/{idC}", method = RequestMethod.GET)
	public Correction findOne(@PathVariable("idC") Long idCorrection) {
		return correctionService.findOne(idCorrection);
	}

	@RequestMapping(value = "corrections/{idC}/{nomMatiere}", method = RequestMethod.GET)
	public Correction findByIdCorrectionAndNomMatiere(@PathVariable("idC") Long idCorrection,
			@PathVariable("nomMatiere") String nomMatiere) {
		return correctionService.findByIdCorrectionAndNomMatiere(idCorrection, nomMatiere);
	}

	@PostMapping("/corrections")
	public String saveCorrection(@RequestParam(name = "noteExamen", required = false) Long noteExamen,
			@RequestParam(name = "nomMatiere", required = false) String nomMatiere,
			@RequestParam(name = "commentaireProfesseur", required = false) String commentaireProfesseur,
			@RequestParam(name = "fichierCorrection", required = false) MultipartFile fichierCorrection) {
		try {
			Correction currentCorr = new Correction();
			currentCorr.setNoteExamen(noteExamen);
			currentCorr.setNomMatiere(nomMatiere);
			currentCorr.setCommentaireProfesseur(commentaireProfesseur);
			currentCorr.setFichierCorrection(fichierCorrection.getBytes());
			correctionService.save(currentCorr);
			return "File uploaded successfully! filename=" + fichierCorrection.getOriginalFilename();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Fail!";
		}
	}

	@RequestMapping(value = "corrections/{idC}", method = RequestMethod.PUT)
	public Correction updateCorrection(@PathVariable("idC") Long idCorrection, @RequestBody Correction correction) {
		Correction currentCorrection = correctionService.findOne(idCorrection);
		currentCorrection.setNoteExamen(correction.getNoteExamen());
		currentCorrection.setNomMatiere(correction.getNomMatiere());
		currentCorrection.setCommentaireProfesseur(correction.getCommentaireProfesseur());
		return correctionService.save(currentCorrection);
	}

	@RequestMapping(value = "corrections/{idCorrection}", method = RequestMethod.DELETE)
	public void deleteCorrection(@PathVariable("idCorrection") Long idCorrection) {
		correctionService.delete(idCorrection);
	}
}
