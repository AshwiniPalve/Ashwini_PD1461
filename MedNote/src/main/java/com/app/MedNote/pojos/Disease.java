package com.app.MedNote.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name="Disease")
public class Disease extends BaseEntity{
	@Column(name="disease",length=50)
	private String disease;
	@Column(name="Symptoms",length=150)
	private String symptoms;

	@OneToMany(mappedBy="disease",cascade=CascadeType.ALL)
	//@JsonManagedReference
	List<Medication> medication=new ArrayList<Medication>();

	@JoinColumn(name="u_id")
	@ManyToOne
	@JsonBackReference
	private User user;


	public Disease() {

	}
	public Disease(String disease, String symptoms, Medication medication,User user) {
		super();
		this.disease = disease;
		this.symptoms = symptoms;

		this.user=user;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}


	public List<Medication> getMedication() {
		return medication;
	}
	public void setMedication(List<Medication> medication) {
		this.medication = medication;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Disease [disease=" + disease + ", symptoms=" + symptoms + ", medication=" + medication + ", User=" + user  +"]";
	}




}
