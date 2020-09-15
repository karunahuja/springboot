package com.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entities.User;

@SpringBootApplication
public class ExamplesecurityApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(ExamplesecurityApplication.class, args);
	
	UserRepository userRepository=context.getBean(UserRepository.class);
	
	User user=(User) new com.springboot.web.entities.User();
	user.setName("karun");
	user.setCity("sangrur");
	user.setStatus("Java programmer");

	User user1=userRepository.save(user);
	
	System.out.println(user1);
	
	}

}
