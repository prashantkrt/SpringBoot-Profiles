package com.myLearning.springApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Profile;
import com.myLearning.springApp.services.Course;
import com.myLearning.springApp.services.Mockito;

@SpringBootApplication
public class SpringBootProfiles implements CommandLineRunner {

	@Value("${myproject.name}")
	private String projectName;

	@Autowired
	private Course course;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfiles.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running...");
		System.out.println("Project " + projectName);
		boolean status = course.registerToCourse();
		if (status) {
			System.out.println("Successfully registered");
		} else {
			System.out.println("Failed to registered");
		}
	}
	
    @Bean
    Mockito mockito()
	{
		return new Mockito();
	}
}
