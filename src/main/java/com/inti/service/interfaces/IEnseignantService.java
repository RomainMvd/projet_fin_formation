package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Enseignant;

public interface IEnseignantService {
	List<Enseignant> findAll();

	Enseignant findOne(Long idEnseignant);

	Enseignant save(Enseignant enseignant);

	void delete(Long idEnseignant);

	Enseignant findByUsername(String username);
	Enseignant findByUsernameAndPassword(String username, String password);
	Enseignant findByEmail(String email);
	
	List<Enseignant> findBySalaire(Double salaire);
	List<Enseignant> findByEnabled(boolean enabled);
}
