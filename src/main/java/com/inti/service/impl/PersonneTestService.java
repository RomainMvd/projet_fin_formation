package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Enseignant;
import com.inti.entities.Etudiant;
import com.inti.entities.Personne;
import com.inti.repository.IPersonneRepository;
import com.inti.service.interfaces.IPersonneTestService;

@Service
public class PersonneTestService implements IPersonneTestService{

	@Autowired
	IPersonneRepository<Enseignant> personneRepository;
	@Autowired
	IPersonneRepository<Etudiant> etudiantRepository;
	@Override
	public List<Enseignant> listeEnseignants() {
		return personneRepository.listeEnseignants();
	}
	@Override
	public List<Etudiant> listeEtudiants() {
		return etudiantRepository.listeEtudiants();
	}
	@Override
	public Etudiant findByUsername(String username) {
		System.out.println(username);
		return personneRepository.findByUsername(username);
	}

	

}
