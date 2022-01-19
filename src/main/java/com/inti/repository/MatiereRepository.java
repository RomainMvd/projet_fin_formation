package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Matiere;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {
	Matiere findByNomMatiere(String nomMatiere);
}
