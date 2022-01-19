package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Examen;

public interface IExamenService {
	List<Examen> findAll();

	Examen findOne(Long idExamen);

	Examen save(Examen Examen);

	void delete(Long idExamen);
	
	Examen findByNomExamen(String nomExamen);
}
