package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Enseignant;


@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant, Long>{
	Enseignant findByUsername(String username);
	Enseignant findByUsernameAndPassword(String username, String password);
}
