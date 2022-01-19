package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Classe;

public interface ClasseRepository extends JpaRepository<Classe, Long> {
	Classe findByIdClasseAndNomClasse(Long idClasse, String nomClasse);

}
