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

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="User_info")
public class User extends BaseEntity{

@Column(name="user_name",length=40)
private String username;
@Column(name="user_age",length=40)
private int age;
@Column(name="user_gender",length=40)
private String gender;
private String address;
private String mobile;
@Column(name="Email",length=40)
private String email;
@Column(name="Password",length=40)
private String password;

@OneToMany(mappedBy="user",cascade = CascadeType.ALL)
@JsonManagedReference
private List<Disease> diseases=new ArrayList<Disease>();



public User() {
	
}


public User (String username, int age, String gender, String address, String mobile, String email,
		String password) {

	
	this.username = username;
	this.age = age;
	this.gender = gender;
	this.address = address;
	this.mobile = mobile;
	this.email = email;
	this.password = password;
}




public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getMobile() {
	return mobile;
}


public void setMobile(String mobile) {
	this.mobile = mobile;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "User [ username=" + username + ", age=" + age + ", gender=" + gender + ", address="
			+ address + ", mobile=" + mobile + ", email=" + email + ", password=" + password + "]";
}



}
