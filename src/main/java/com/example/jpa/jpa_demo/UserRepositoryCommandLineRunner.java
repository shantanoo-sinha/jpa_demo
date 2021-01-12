/**
 * 
 */
package com.example.jpa.jpa_demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpa.jpa_demo.entity.User;
import com.example.jpa.jpa_demo.repository.UserRepository;
import com.example.jpa.jpa_demo.service.UserDAOService;

/**
 * @author Shantanoo
 *
 */
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jill", "Admin");
		userRepository.save(user);
		log.info("User:" + user);
		
		Optional<User> findByIdUser = userRepository.findById(2L);
		log.info("findByIdUser:" + findByIdUser);
		
		List<User> findAllUsers = userRepository.findAll();
		log.info("findAllUsers:" + findAllUsers);
	}

}
