package com.app.MedNote.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.MedNote.pojos.Medication;

public interface MedicationRepository extends JpaRepository<Medication, Integer> {

}
