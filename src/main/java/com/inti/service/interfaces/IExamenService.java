package com.inti.service.interfaces;

import java.util.Date;
import java.util.List;

import com.inti.entities.Examen;

public interface IExamenService {
	List<Examen> findAll();

	Examen findOne(Long idExamen);

	Examen save(Examen Examen);

	void delete(Long idExamen);
	
	List<Examen> findByDateExamen(Date dateExamen);
	List<Examen> findByNomExamen(String nomExamen);
}
