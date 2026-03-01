package com.nicolas.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nicolas.workshopmongo.domain.User;
import com.nicolas.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	
	public List<User> findaAll(){
		return repo.findAll();
	}
	
	
	
}
