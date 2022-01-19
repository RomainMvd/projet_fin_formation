package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Matiere;

public interface IMatiereService {
	List<Matiere> findAll();

	Matiere findOne(Long idMatiere);

	Matiere save(Matiere Matiere);

	void delete(Long idMatiere);
	
	Matiere findByNomMatiere(String nomMatiere);
}
