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

import com.app.MedNote.Service.MedicationServiceImpl;
import com.app.MedNote.pojos.Medication;
import com.app.MedNote.pojos.User;

@RestController
@RequestMapping("/Medications")
public class MedicationController {
	@Autowired
	 private MedicationServiceImpl medicationService;
	  
	 @GetMapping
	 public List<Medication> getAllUser() {
			return medicationService.getAllMedicationDetails();
		}
	 
	 @PostMapping("/AddMedication")
		public Medication AddNewMedication(@RequestBody Medication medication) {
			return medicationService.registerMedication(medication);
		}
	 
	 @PutMapping("/edit/{mid}")
		User editMedication(@RequestBody Medication medication, @PathVariable Integer mid) {
			medication.setId(mid);
			return new User();
		}
	 
	 @DeleteMapping("/delete/{mid}")
		public String deleteMedicationById(@PathVariable Integer mid) {
			return  medicationService.deleteMedicationById(mid);
		}
	}


