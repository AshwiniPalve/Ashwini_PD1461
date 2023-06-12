package com.app.MedNote.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.MedNote.Service.DiseaseService;
import com.app.MedNote.Service.DiseaseServiceImpl;
import com.app.MedNote.pojos.Disease;
import com.app.MedNote.pojos.User;


@RestController
@RequestMapping("/Diseases")
public class DiseaseController {
 @Autowired
 private DiseaseServiceImpl diseaseService;
  
 @GetMapping
 public List<Disease> getAllUser() {
		return diseaseService.getAllDiseaseDetails();
	}
 
 @PostMapping("/AddDisease")
	public Disease AddNewDisease(@RequestBody Disease disease) {
		return diseaseService.registerDisease(disease);
	}
 
 @PutMapping("/edit/{did}")
	User editDisease(@RequestBody Disease disease, @PathVariable Integer did) {
		disease.setId(did);
		return new User();
	}
 
 @DeleteMapping("/delete/{did}")
	public String deleteDiseseById(@PathVariable Integer did) {
		return  diseaseService.deleteDiseaseById(did);
	}
}
