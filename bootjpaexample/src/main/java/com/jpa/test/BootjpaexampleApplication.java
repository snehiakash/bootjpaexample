package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		/*
		 * User user =new User();
		 *  user.setName("Akash Kumar"); 
		 *  user.setCity("Delhi");
		 * user.setStatus("I am Java Programmer");
		 *  User user1=userRepository.save(user);
		 * System.out.println(user1);
		 */
		//Create objects of User
		//User user1=new User();
		//user1.setName("Uttam");
		//user1.setCity("city1");
		//user1.setStatus("Python Programmer");
		
		/*
		 * User user2=new User();
		 *  user2.setName("Ankit");
		 *   user2.setCity("city2");
		 * user2.setStatus("Java Programmer");
		 */
		
	//  Saving Single User	
	//	User resultUser=userRepository.save(user2);
		
		//List<User> users=List.of(user1,user2);
		//saves multiple objects
		//Iterable<User>result=userRepository.saveAll(users);
		
		//result.forEach(user->{
			//System.out.println(user);
		//});
		
	
		//System.out.println("Saved User"+resultUser);
		//System.out.println("done");
		
		//update the user of id 11
		
		/*
		 * Optional<User> optional=userRepository.findById(353);
		 * 
		 * User user=optional.get(); user.setName("Ankit Tiwari"); User
		 * result=userRepository.save(user);
		 * 
		 * System.out.println(result);
		 */
		
		//Iterable<User> itr=userRepository.findAll();
		//Iterator<User> iterator=itr.iterator();
		//while(iterator.hasNext()) {
			//User user=iterator.next();
			//System.out.println(user);
		//}
		
	//itr.forEach(user->{System.out.println(user);});	
		
	//Deleting the user Element.
		//userRepository.deleteById(352);
		//System.out.println("deleted");
		
	//	Iterable<User> allusers=userRepository.findAll();
	//	allusers.forEach(user->{System.out.println(user);});
	//	userRepository.deleteAll(allusers);
		
	/*
	 * List<User> users=userRepository.findByName("Akash Kumar");
	 * users.forEach(e->System.out.println(e));
	 */
	//	List<User> users=userRepository.findByNameAndCity("john","mumbai");
	//users.forEach(e->System.out.println(e));
	
	
		List<User> allUser=userRepository.getAllUser();
		allUser.forEach(e->System.out.println(e));
		
		System.out.println("--------------------------------------");
		
		List<User> userByName=userRepository.getUserByName("john","mumbai");
         userByName.forEach(e->{System.out.println(e);});
         
         
     	System.out.println("--------------------------------------");
          List<User>  	users=userRepository.getUsers();
          users.forEach(e->{System.out.println(e);});
	}
	

}
