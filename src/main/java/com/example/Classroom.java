package com.example;

import javax.inject.Inject;

class Classroom {

	private Student student;
	private Teacher teacher;

	@Inject
	Classroom(Student student, Teacher teacher) {
		this.student  = student;
		this.teacher = teacher;
	}

	public void printStudent() {
		System.out.println(this.student.toString());
	}

	public void printTeacher() {
		System.out.println(this.teacher.toString());
	}
}
