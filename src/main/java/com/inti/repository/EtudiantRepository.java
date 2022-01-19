package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Etudiant;

@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant, Long>{
	Etudiant findByUsername(String username);
	Etudiant findByUsernameAndPassword(String username, String password);
}
