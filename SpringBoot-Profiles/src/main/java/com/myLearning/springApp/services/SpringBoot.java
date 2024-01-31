package com.myLearning.springApp.services;

import org.springframework.stereotype.Component;

@Component
public class SpringBoot implements Course {

	@Override
	public boolean registerToCourse() {	
		System.out.println("SpringBoot course registered");
		return true;
	}

}
