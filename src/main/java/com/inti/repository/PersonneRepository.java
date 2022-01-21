package com.inti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long>{
	Personne findByUsername(String username);
	
	public String commandeSQL = "SELECT * FROM personne WHERE personne_type=?1";// Premier type indiqué dans la BD est enseignant

	@Query(value = commandeSQL, nativeQuery = true)
	List<Personne> listeEnseignants(String type);
}
