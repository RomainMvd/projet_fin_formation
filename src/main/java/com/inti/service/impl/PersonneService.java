package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Personne;
import com.inti.repository.PersonneRepository;
import com.inti.service.interfaces.IPersonneService;

@Service
public class PersonneService implements IPersonneService{

	@Autowired
	PersonneRepository personneRepository;
	
	@Override
	public List<Personne> findAll() {
		return personneRepository.findAll();
	}

	@Override
	public Personne findOne(Long idPersonne) {
		return personneRepository.findById(idPersonne).get();
	}

	@Override
	public Personne save(Personne personne) {
		return personneRepository.save(personne);
	}

	@Override
	public void delete(Long idPersonne) {
		personneRepository.deleteById(idPersonne);
		
	}

	@Override
	public Personne findByUsername(String username) {
		return personneRepository.findByUsername(username);
	}

	@Override
	public Personne findByUsernameAndPassword(String username, String password) {
		return personneRepository.findByUsernameAndPassword(username, password);
	}

}
