package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Examen;

public interface ExamenRepository extends JpaRepository<Examen, Long> {
	Examen findByNomExamen(String nomExamen);
}
