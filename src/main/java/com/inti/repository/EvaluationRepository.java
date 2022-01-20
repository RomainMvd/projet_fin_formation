package com.inti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Evaluation;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
	
	List<Evaluation> findByNomCours(String nomCours);
}
