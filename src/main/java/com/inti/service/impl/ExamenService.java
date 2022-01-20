package com.inti.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Examen;
import com.inti.repository.ExamenRepository;
import com.inti.entities.Examen;
import com.inti.service.interfaces.IExamenService;

@Service
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
	public List<Examen> findByDateExamen(Date dateExamen) {
		return examenRepository.findByDateExamen(dateExamen);
	}

	@Override
	public List<Examen> findByNomExamen(String nomExamen) {
		return examenRepository.findByNomExamen(nomExamen);
	}

	

}
