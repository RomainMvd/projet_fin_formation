package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Examen;
import com.inti.repository.ExamenRepository;
import com.inti.entities.Examen;
import com.inti.service.interfaces.IExamenService;

public class ExamenService implements IExamenService {
	@Autowired
	ExamenRepository examenRepository;
	
	@Override
	public List<Examen> findAll() {
		
		return examenRepository.findAll();
	}

	@Override
	public Examen findOne(Long idExamen) {
		return examenRepository.findById(idExamen).get();
	}

	@Override
	public Examen save(Examen examen) {
		return examenRepository.save(examen);
	}

	@Override
	public void delete(Long idExamen) {
		examenRepository.deleteById(idExamen);
		
	}

	@Override
	public Examen findByNomExamen(String nomExamen) {
		return examenRepository.findByNomExamen(nomExamen);
	}

}
