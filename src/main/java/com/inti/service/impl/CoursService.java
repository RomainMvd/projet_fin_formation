package com.inti.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Cours;
import com.inti.entities.Examen;
import com.inti.repository.CoursRepository;
import com.inti.service.interfaces.ICoursService;

@Service
public class CoursService implements ICoursService{
	
	@Autowired
	CoursRepository coursRep;

	@Override
	public Cours save(Cours cours) {
		return coursRep.save(cours);
	}

	@Override
	public List<Cours> findAll() {
		return coursRep.findAll();
	}

	@Override
	public Cours findOne(Long idCours) {
		return coursRep.findById(idCours).get();
	}

	@Override
	public void delete(Long idCours) {
		coursRep.deleteById(idCours);
	}

	@Override
	public Cours findByNomCours(String nomCours) {
		return coursRep.findByNomCours(nomCours);
	}

	/*
	@Override
	public List<Cours> findByNomMatiere(String nomMatiere) {
		return coursRep.findByNomMatiere(nomMatiere);
	}

	@Override
	public List<Cours> findByExamens(Set<Examen> examens) {
		return coursRep.findByExamens(examens);
	}
	
	*/

}
