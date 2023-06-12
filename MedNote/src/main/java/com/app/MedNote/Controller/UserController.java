package com.app.MedNote.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.MedNote.Service.UserServiceImpl;
import com.app.MedNote.pojos.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceImpl userService;

	@GetMapping
	public List<User> getAllUser() {
		return userService.getAllUSerDetails();
	}

	@PostMapping("/register")
	public User AddNewUser(@RequestBody User user) {
		return userService.registerUser(user);
	}

	@PutMapping("/edit/{uid}")
	User editUser(@RequestBody User user, @PathVariable Integer uid) {
		user.setId(uid);
		return new User();
	}
	
	@DeleteMapping("/delete/{uid}")
	public String deleteUserById(@PathVariable Integer uid) {
		return  userService.deleteUserById(uid);
	}
}
