package com.example;

class PhysicsTeacher implements Teacher {
	
	private String subject;

	public PhysicsTeacher() {
		this.subject = "Physics";	
	}

	@Override
	public String getSubject() {
		return (this.subject);
	}

	@Override
	public String toString() {
		return "I am a teacher who teaches " + getSubject() + "!";
	}
}
