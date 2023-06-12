package com.app.MedNote.pojos;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="Medications")
public class Medication extends BaseEntity {
	
@Column(name="Medicines" ,length=50)
private String medicine;

@Column(name="Dosages" ,length=50)
private String dosage;

@Temporal(TemporalType.TIME)
@Column(name="Time",length=50)
private Date Time;

@ManyToOne
@JsonBackReference
@JoinColumn(name="Disease_ID")
private Disease disease;

public Medication(String medicine, String dosage, Date time,Disease disease) {
	super();
	this.medicine = medicine;
	this.dosage = dosage;
	Time = time;
	this.disease=disease;
}



public String getMedicine() {
	return medicine;
}

public void setMedicine(String medicine) {
	this.medicine = medicine;
}

public String getDosage() {
	return dosage;
}

public void setDosage(String dosage) {
	this.dosage = dosage;
}

public Date getTime() {
	return Time;
}
public void setTime(Date time) {
	Time = time;
}

public Disease getDisease() {
	return disease;
}

public void setDisease(Disease disease) {
	this.disease = disease;
}


@Override
public String toString() {
	return "Medication [medicine=" + medicine + ", dosage=" + dosage + ", Time=" + Time +", Disease=" + disease + "]";
} 
 


}

