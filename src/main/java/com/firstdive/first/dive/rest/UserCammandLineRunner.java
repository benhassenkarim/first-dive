package com.firstdive.first.dive.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCammandLineRunner  implements CommandLineRunner{

	private static final Logger log=LoggerFactory.getLogger(UserCammandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("karim","admin"));
		userRepository.save(new User("hamama","admin"));
		userRepository.save(new User("tokebri","admin"));
		for(User user:userRepository.findAll()) {
			log.info(user.toString());
		}
		log.info("admin users are");
		log.info("___________");
		for(User user:userRepository.findByRole("admin")) {
			log.info(user.toString());
		}
	}

}
