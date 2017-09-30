package com.example;

import com.google.inject.AbstractModule;

public class PhysicsClassroomModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Student.class).to(PhysicsStudent.class);
		bind(Teacher.class).to(PhysicsTeacher.class);
	}
}
