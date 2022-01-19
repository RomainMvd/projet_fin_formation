package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Correction;
import com.inti.repository.CorrectionRepository;
import com.inti.service.interfaces.ICorrectionService;

@Service
public class CorrectionService implements ICorrectionService {
	@Autowired
	CorrectionRepository correctionRepository;

	@Override
	public List<Correction> findAll() {
		return correctionRepository.findAll();
	}

	@Override
	public Correction findOne(Long idCorrection) {
		return correctionRepository.findById(idCorrection).get();
	}

	@Override
	public Correction save(Correction correction) {
		return correctionRepository.save(correction);
	}

	@Override
	public void delete(Long idCorrection) {
		correctionRepository.deleteById(idCorrection);
	}

	@Override
	public Correction findByIdCorrectionAndNomMatiere(Long idCorrection, String nomMatiere) {
		return correctionRepository.findByIdCorrectionAndNomMatiere(idCorrection, nomMatiere);
	}
}
