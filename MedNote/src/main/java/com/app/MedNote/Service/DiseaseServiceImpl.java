package com.app.MedNote.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.MedNote.Dao.DiseaseRepository;

import com.app.MedNote.pojos.Disease;

@Service
@Transactional
public class DiseaseServiceImpl implements DiseaseService{
	@Autowired
	private DiseaseRepository diseaseRepo;

	public List<Disease> getAllDiseaseDetails() {
		// TODO Auto-generated method stub
		return diseaseRepo.findAll();
	}

	public Disease registerDisease(Disease disease) {
		// TODO Auto-generated method stub
		return diseaseRepo.save(disease);
	}


	public String deleteDiseaseById(Integer did) {
		// TODO Auto-generated method stub
		if(diseaseRepo.existsById(did)) {
		diseaseRepo.deleteById(did);
		return "Successfully deleted";
		}
		return "Invalid id";
	
	}

	
	

	
	

	

		
	
	

	
}
