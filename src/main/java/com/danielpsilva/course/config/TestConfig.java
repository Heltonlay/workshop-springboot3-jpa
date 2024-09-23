package com.danielpsilva.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.danielpsilva.course.entities.User;
import com.danielpsilva.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "joao", "joao@gmail.com", "9999999", "123456");
		User u2 = new User(null, "maria", "maria@gmail.com", "9999999", "9876543");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
