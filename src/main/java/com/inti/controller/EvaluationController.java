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

import com.inti.entities.Cours;
import com.inti.entities.Evaluation;
import com.inti.service.interfaces.ICoursService;
import com.inti.service.interfaces.IEvaluationService;

@RestController
@CrossOrigin
public class EvaluationController {
	@Autowired
	IEvaluationService evaluationService;
	@Autowired
	ICoursService coursService;

	@RequestMapping(value = "evaluations", method = RequestMethod.GET)
	public List<Evaluation> findAll() {
		return evaluationService.findAll();
	}

	@RequestMapping(value = "evaluations/{idEv}", method = RequestMethod.GET)
	public Evaluation findOne(@PathVariable("idEv") Long idEvaluation) {
		return evaluationService.findOne(idEvaluation);
	}
	
	@RequestMapping(value="evaluations/", method = RequestMethod.GET)
	public List<Evaluation> findByCours(Cours cours) {
		return evaluationService.findByCours(cours);
	}

	@PostMapping("/evaluations")
	public Evaluation saveEvaluation(@RequestParam(name ="note", required = false) Double noteCours,
		@RequestParam(name = "commentaire", required = false) String commentaire,
		@RequestParam(name="nomCours", required = false) Cours nomCours ){
		Evaluation currentEva = new Evaluation();
		currentEva.setNoteCours(noteCours);
		currentEva.setCommentaire(commentaire);
		currentEva.setCours(nomCours);
		return evaluationService.save(currentEva);
	}

	@RequestMapping(value = "evaluations/{idEv}", method = RequestMethod.PUT)

	public Evaluation updateEvaluation(@PathVariable("idEv") Long idEvaluation, @RequestBody Evaluation evaluation) {
		Evaluation currentEvaluation = evaluationService.findOne(idEvaluation);
		currentEvaluation.setNoteCours(evaluation.getNoteCours());
		currentEvaluation.setCommentaire(evaluation.getCommentaire());
		currentEvaluation.setCours(evaluation.getCours());
		return evaluationService.save(currentEvaluation);
	}

	@RequestMapping(value = "evaluations/{idEvaluation}", method = RequestMethod.DELETE)
	public void deleteEvaluation(@PathVariable("idEvaluation") Long idEvaluation) {
		evaluationService.delete(idEvaluation);
	}
	
}
