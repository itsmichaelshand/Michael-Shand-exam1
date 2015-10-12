package com.cisc181.core;

import java.util.UUID;

public class Course {
	//attributes for course
	private UUID CourseID;
	private String CourseName;
	private int GradePoint;
	
	
	public Course(UUID CourseID, String Coursename, int GradePoint){
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoint = GradePoint;
	}
	
	//getters and setters for course attributes
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoint() {
		return GradePoint;
	}
	public void setGradePoint(int gradePoint) {
		GradePoint = gradePoint;
	}
	
	
	

}
