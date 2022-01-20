package com.inti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Etudiant;
import com.inti.entities.Personne;


@Repository
public interface EtudiantRepository extends JpaRepository<Personne, Long> {
	Etudiant findByUsername(String username);

	Etudiant findByUsernameAndPassword(String username, String password);


	public String commandeSQL = "SELECT * FROM personne WHERE type=?1";

	@Query(value = commandeSQL, nativeQuery = true)
	List<Personne> listeEnseignants(String type);
}
	Etudiant findByEmail(String email);
	
	List<Etudiant> findByMoyenne(Double moyenne);
	List<Etudiant> findByEnabled(boolean enabled);
}

