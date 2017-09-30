package com.example;

class PhysicsStudent implements Student {


	private String description;

	public PhysicsStudent() {
		this.description = "I am a student who studies physics!";
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public String toString() {
		return description;
	}
}
