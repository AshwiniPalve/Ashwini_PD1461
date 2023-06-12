package com.app.MedNote.Dao;



import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.MedNote.pojos.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	
	
}

