package br.com.portfolio.crud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.portfolio.crud.entities.User;
import br.com.portfolio.crud.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Andrade Oliveira", "andoliveira@yahoo.com", "999999999", "123456"); 
		User u2 = new User(null, "João Silva", "jsilva@gamil.com", "9414141413", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
