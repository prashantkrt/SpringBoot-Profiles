package com.myLearning.springApp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Microservices implements Course {

	@Override
	public boolean registerToCourse() {
		System.out.println("Microservices course enrolled");
		return true;
	}
}
