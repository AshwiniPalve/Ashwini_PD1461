package com.app.MedNote.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.MedNote.pojos.Disease;

public interface DiseaseRepository extends JpaRepository<Disease, Integer> {

	

}
