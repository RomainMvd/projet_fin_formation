package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Cours;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {

	Cours findByChapitre (String chapitre);
}
