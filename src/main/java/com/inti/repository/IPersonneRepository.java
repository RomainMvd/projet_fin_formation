package com.inti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Enseignant;
import com.inti.entities.Etudiant;
import com.inti.entities.Personne;

@Repository
public interface IPersonneRepository<T extends Personne> extends JpaRepository<T, Long>{
	
	public String commandeSQL = "SELECT * FROM personne WHERE personne_type='enseignant'";// Premier type indiqué dans la BD est enseignant

	@Query(value = commandeSQL, nativeQuery = true)
	List<Enseignant> listeEnseignants();
	
	public String commandeSQL2 = "SELECT * FROM personne WHERE personne_type='etudiant'";// Premier type indiqué dans la BD est enseignant

	@Query(value = commandeSQL2, nativeQuery = true)
	List<Etudiant> listeEtudiants();
	
	Etudiant findByUsername(String username);
	
}
