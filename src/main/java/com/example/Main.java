package com.example;

import com.google.inject.Injector;
import com.google.inject.Guice;


public class Main {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new PhysicsClassroomModule());
		Classroom classroom = injector.getInstance(Classroom.class);

		classroom.printStudent();
		classroom.printTeacher();
	}
	
}
