package com.app.MedNote.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.MedNote.Dao.MedicationRepository;
import com.app.MedNote.pojos.Medication;


@Service
@Transactional
public class MedicationServiceImpl implements MedicationService {

	@Autowired
	private MedicationRepository medicationRepo;

	public List<Medication> getAllMedicationDetails() {
		
		// TODO Auto-generated method stub
		return medicationRepo.findAll();
	}
	
	public Medication registerMedication(Medication medication) {
		// TODO Auto-generated method stub
		return medicationRepo.save(medication);
	}

	public String deleteMedicationById(Integer mid) {
		// TODO Auto-generated method stub
		if(medicationRepo.existsById(mid)) {
			medicationRepo.deleteById(mid);
			return "Successfully deleted";
		}
		return "Invalid Medication";
	}

	

}
