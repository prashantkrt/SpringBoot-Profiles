package com.myLearning.springApp.services;

public class Mockito implements Course {

	@Override
	public boolean registerToCourse() {
		System.out.println("Mockito Course registered!!!");
		return true;
	}
}
