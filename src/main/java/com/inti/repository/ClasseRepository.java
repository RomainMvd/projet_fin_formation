package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Classe;
@Repository
public interface ClasseRepository extends JpaRepository<Classe, Long> {

	Classe findByNomClasse(String nomClasse);

}
