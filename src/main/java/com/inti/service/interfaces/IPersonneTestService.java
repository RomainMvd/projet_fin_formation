package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Enseignant;
import com.inti.entities.Etudiant;
import com.inti.entities.Personne;

public interface IPersonneTestService {

	List<Enseignant> listeEnseignants();
	List<Etudiant> listeEtudiants();
	Etudiant findByUsername(String username);
}
