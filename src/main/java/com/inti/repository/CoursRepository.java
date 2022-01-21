package com.inti.repository;

import java.util.List;
import java.util.Set;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Cours;
import com.inti.entities.Examen;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {

	Cours findByNomCours(String nomCours);
	// PLUS

	Set<Cours> findByNomMatiere(String nomMatiere);
	Set<Cours> findByExamens(Set<Examen> examens);

}
