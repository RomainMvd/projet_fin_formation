package com.inti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Correction;

@Repository
public interface CorrectionRepository extends JpaRepository<Correction, Long> {
	
	List<Correction> findByNomMatiere(String nomMatiere);

}
