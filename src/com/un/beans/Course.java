package com.un.beans;

import java.util.Set;

public class Course {
	private Set<String> faculties;

	public Course(Set<String> faculties) {
		super();
		this.faculties = faculties;
	}

	@Override
	public String toString() {
		return "Course [faculties=" + faculties + "Faculties Type: "+faculties.getClass().getName()+ "]";
	}
	
	
}
