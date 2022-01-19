package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Cours;

public interface ICoursService {
	
	Cours save(Cours cours);

	void delete (Long idCours);

	List<Cours> findAll();

	Cours findOne(Long idCours);
	
	Cours findByChapitre(String chapitre);

}
