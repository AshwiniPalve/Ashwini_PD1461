package com.app.MedNote.Service;

import java.util.List;


import com.app.MedNote.pojos.Medication;

public interface MedicationService {
	  List<Medication> getAllMedicationDetails();
		
	 Medication registerMedication(Medication medication) ;
	 String deleteMedicationById(Integer mid) ;
	 

		
}
