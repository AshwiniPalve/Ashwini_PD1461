package com.app.MedNote.Service;

import java.util.List;

import com.app.MedNote.pojos.Disease;
import com.app.MedNote.pojos.User;

public interface DiseaseService {

	  List<Disease> getAllDiseaseDetails();
		
	

	 Disease registerDisease(Disease disease) ;
		

	 String deleteDiseaseById(Integer did) ;

	
}
