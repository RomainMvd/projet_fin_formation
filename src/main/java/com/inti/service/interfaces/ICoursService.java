package com.inti.service.interfaces;

import java.util.List;
import java.util.Set;

import com.inti.entities.Cours;
import com.inti.entities.Examen;

public interface ICoursService {

	Cours save(Cours cours);

	void delete(Long idCours);

	List<Cours> findAll();

	Cours findOne(Long idCours);

	Cours findByNomCours(String nomCours);

	// PLUS
	/*
	List<Cours> findByNomMatiere(String nomMatiere);

	List<Cours> findByExamens(Set<Examen> examens);
	*/

}
