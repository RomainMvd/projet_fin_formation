package com.inti.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Examen;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long> {
	
	List<Examen> findByDateExamen(Date dateExamen);
	List<Examen> findByNomExamen(String nomExamen);
}
