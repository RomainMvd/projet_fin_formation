package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Matiere;
import com.inti.repository.MatiereRepository;
import com.inti.service.interfaces.IMatiereService;

public class MatiereService implements IMatiereService {
	@Autowired
	MatiereRepository matiereRepository;
	
	@Override
	public List<Matiere> findAll() {
		
		return matiereRepository.findAll();
	}

	@Override
	public Matiere findOne(Long idMatiere) {
		return matiereRepository.findById(idMatiere).get();
	}

	@Override
	public Matiere save(Matiere matiere) {
		return matiereRepository.save(matiere);
	}

	@Override
	public void delete(Long idMatiere) {
		matiereRepository.deleteById(idMatiere);
		
	}

	@Override
	public Matiere findByNomMatiere(String nomMatiere) {
		return matiereRepository.findByNomMatiere(nomMatiere);
	}

}
