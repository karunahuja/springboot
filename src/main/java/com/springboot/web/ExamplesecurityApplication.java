package com.springboot.web;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entities.User;
import com.sun.el.stream.Optional;

@SpringBootApplication
public class ExamplesecurityApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(ExamplesecurityApplication.class, args);
	
	UserRepository userRepository=context.getBean(UserRepository.class);
	
	/*
	 * User user=(User) new com.springboot.web.entities.User();
	 * user.setName("karun1"); user.setCity("sangrur");
	 * user.setStatus("Java programmer");
	 * 
	 * //User user1=userRepository.save(user); User user1=new User();
	 * user1.setName("ahuja1"); user1.setCity("city2"); user1.setStatus("python ");
	 * 
	 * List<User> users=List.of(user1,user);
	 * 
	 * //insert Iterable<User> resultUser=userRepository.saveAll(users);
	 * 
	 * System.out.println(resultUser);
	 * 
	 */
	
	
	//update
 java.util.Optional<User> optional= userRepository.findById(2);

 User usersearch=optional.get();
 
 usersearch.setName("Tiwari");
 
 User result=userRepository.save(usersearch);
 
 System.out.println(result);
 	
 
 //how to get the data:- Use findById as above
 //Get all data
 
Iterable<User> itr= userRepository.findAll();


itr.forEach(user-> {System.out.println(user);
});
	
	
//Deleting the user element

//userRepository.deleteById(3);


//for deleting all

userRepository.deleteAll(itr);



	}

}
