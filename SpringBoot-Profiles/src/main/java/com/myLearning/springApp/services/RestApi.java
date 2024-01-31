package com.myLearning.springApp.services;

import org.springframework.stereotype.Component;

@Component
public class RestApi implements Course {

	@Override
	public boolean registerToCourse() {	
		System.out.println("RestAPI course enrolled");
		return true;
	}

}
