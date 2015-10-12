package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	//Enrollment attributes
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double grade;
	
	private Enrollment(){
		//no-args constructor
	}
	
	private Enrollment(UUID StudentID, UUID SecionID){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	
	public Enrollment(UUID SectionID, UUID StudentID, UUID EnrollmentID, double grade){
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.EnrollmentID = EnrollmentID;
		this.grade = grade;
		
	}

	
	
	//getters and setters for enrollment attributes
	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	
}
