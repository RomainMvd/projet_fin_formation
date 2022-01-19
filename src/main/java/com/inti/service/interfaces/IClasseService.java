package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Classe;

public interface IClasseService {
	List<Classe> findAll();

	Classe findOne(Long idClasse);

	Classe save(Classe classe);

	void delete(Long idClasse);

	Classe findByIdAndNom(Long idClasse, String nomClasse);
}
