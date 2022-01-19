package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Matiere;
@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Long> {
	Matiere findByNomMatiere(String nomMatiere);
}
