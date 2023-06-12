package com.app.MedNote.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.MedNote.pojos.User;
import com.app.MedNote.Dao.UserRepository;

@Service 
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepo;

	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

//	@Override
//	public User findByEmail(String email) {
//		// TODO Auto-generated method stub
//		return userRepo.findByEmail(email);
//	}

//	@Override
//	public User findById(Integer userId) {
//		// TODO Auto-generated method stub
//		return userRepo.findById(userId).orElseThrow(() -> new UserNotFoundException("Invalid Credentials"));
//	}

//	@Override
//	public String deleteUserById(Integer uid) {
//		// TODO Auto-generated method stub
//		userRepo.deleteById(uid);
//		return "User with id: " + uid + " deleted successfully!!";
//	}

	

@Override
public List<User> getAllUSerDetails() {
	// TODO Auto-generated method stub
	return userRepo.findAll();
}

public String deleteUserById(Integer uid) {
	// TODO Auto-generated method stub
	userRepo.deleteById(uid);
	return "deleted successfully";
}

	

}
