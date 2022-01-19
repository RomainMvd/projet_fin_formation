package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Cours;
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
	public Cours findByChapitre(String chapitre) {
		return coursRep.findByChapitre(chapitre);
	}


	@Override
	public void delete(Long idCours) {
		coursRep.deleteById(idCours);
	}
	
	

}
