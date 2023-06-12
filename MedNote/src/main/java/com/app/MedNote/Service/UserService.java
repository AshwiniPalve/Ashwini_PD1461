package com.app.MedNote.Service;

import java.util.List;

//import com.app.dto.LoginRequest;

import com.app.MedNote.pojos.User;

public interface UserService {
	User registerUser(User user);
    List<User> getAllUSerDetails();
//	User findByEmail(String email);

//	User findById(Integer userId);

	String deleteUserById(Integer uid);
}


