package com.cisc181.core;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.junit.Before;
import com.cisc181.core.*;
import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	Date date1 = new Date();
	Date date2 = new Date();
	Date date3 = new Date();
	Date date4 = new Date();
	
	//SemesterID
	UUID Semester1ID = UUID.randomUUID();
	UUID Semester2ID = UUID.randomUUID();
	//Course ID
	UUID Course1ID = UUID.randomUUID();
	UUID Course2ID = UUID.randomUUID();
	UUID Course3ID = UUID.randomUUID();
	//sectionID
	UUID Section1ID = UUID.randomUUID();
	UUID Section2ID = UUID.randomUUID();
	UUID Section3ID = UUID.randomUUID();
	UUID Section4ID = UUID.randomUUID();
	UUID Section5ID = UUID.randomUUID();
	UUID Section6ID = UUID.randomUUID();
	//student ID
	UUID Student1ID = UUID.randomUUID();
	UUID Student2ID = UUID.randomUUID();
	UUID Student3ID = UUID.randomUUID();
	UUID Student4ID = UUID.randomUUID();
	UUID Student5ID = UUID.randomUUID();
	UUID Student6ID = UUID.randomUUID();
	UUID Student7ID = UUID.randomUUID();
	UUID Student8ID = UUID.randomUUID();
	UUID Student9ID = UUID.randomUUID();
	UUID Student10ID = UUID.randomUUID();
	
	@Before
	public void setUpStudent(){
	Student student1 = new Student("Michael", "James", "Shand",date1, eMajor.COMPSI,
			"my Road", "(302)-555-5555", "Myemail@mai.com");
	Student student2 = new Student("James", "Pack", "Smith", date2, eMajor.CHEM,
			"your Road", "(302)-555-4445", "Youremail@mai.com");
	Student student3 = new Student("Cassie", "nole", "Benzenhoffer", date3, eMajor.NURSING,
			"Cassies Road", "(302)-252-4352", "Cassemail@mai.com");
	Student student4 = new Student("James", "lea", "pit", date3, eMajor.CHEM,
			"Cassies Road", "(302)-555-3413", "Cassemail@mai.com");
	Student student5 = new Student("michael", "james", "shand", date4, eMajor.BUSINESS,
			"Cassies Road", "(302)-555-8235", "Cassemail@mai.com");
	Student student6 = new Student("eric", "nicole", "Benzenhoffer", date1, eMajor.PHYSICS,
			"Cassies Road", "(302)-836-4352", "Cassemail@mai.com");
	Student student7 = new Student("harrison", "michael", "moyer", date2, eMajor.CHEM,
			"Cassies Road", "(302)-934-4352", "Cassemail@mai.com");
	Student student8 = new Student("sarah", "ball", "gross", date4, eMajor.COMPSI,
			"Cassies Road", "(302)-093-4352", "Cassemail@mai.com");
	Student student9 = new Student("lia", "hue", "nick", date3, eMajor.NURSING,
			"Cassies Road", "(302)-832-4352", "Cassemail@mai.com");
	Student student10 = new Student("ian", "cole", "heffner", date3, eMajor.COMPSI,
			"Cassies Road", "(302)-444-4352", "heman@mai.com");
	
	ArrayList<Student> Courses = new ArrayList(
			Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8,
					student9, student10));
	
	
	}

	@Before
	public void setUpCourse(){
	
		Course CourseMath = new Course(Course1ID, "Math", 3);
		Course CourseScience = new Course(Course2ID, "Science", 4);
		Course CourseHist = new Course(Course3ID, "Hist", 3);
		
		ArrayList<Course> Courses = new ArrayList(
				Arrays.asList(CourseMath, CourseScience, CourseHist));
	}
	@Before
	public void setUpSemester(){
		Semester semester1 = new Semester(Semester1ID, date1, date2);
		
		Semester semester2 = new Semester(Semester2ID, date3, date4);
		
		ArrayList<Semester> semesters = new ArrayList(
				Arrays.asList(semester1, semester2));
	}
	
	@Before
	public void setUpSection(){
		Section section1= new Section(Course1ID, Semester1ID, Section1ID, 101);
		Section section2= new Section(Course2ID, Semester1ID, Section2ID, 102);
		Section section3= new Section(Course3ID, Semester1ID, Section3ID, 103);
		Section section4= new Section(Course1ID, Semester2ID, Section4ID, 104);
		Section section5= new Section(Course2ID, Semester2ID, Section5ID, 105);
		Section section6= new Section(Course3ID, Semester2ID, Section6ID, 106);
		
		ArrayList<Section> semesters = new ArrayList(
				Arrays.asList(section1, section2, section3, section4, section5, section6));
	}
	
	@Test
	public void testEnroll() {
		Enrollment enroll1 = new Enrollment(Section1ID, Student1ID, Student1ID, 80.0);
		Enrollment enroll2 = new Enrollment(Section2ID, Student2ID, Student2ID, 85.0);
		Enrollment enroll3 = new Enrollment(Section3ID, Student3ID, Student3ID, 90.0);
		Enrollment enroll4 = new Enrollment(Section4ID, Student4ID, Student4ID, 95.0);
		Enrollment enroll5 = new Enrollment(Section5ID, Student5ID, Student5ID, 99.0);
		Enrollment enroll6 = new Enrollment(Section6ID, Student6ID, Student6ID, 70.0);
		Enrollment enroll7 = new Enrollment(Section1ID, Student7ID, Student7ID, 75.0);
		Enrollment enroll8 = new Enrollment(Section2ID, Student8ID, Student8ID, 70.0);
		Enrollment enroll9 = new Enrollment(Section3ID, Student9ID, Student9ID, 85.0);
		Enrollment enroll10 = new Enrollment(Section4ID, Student10ID, Student10ID, 90.0);
	}
	@Test
	public void testGPA(){
		//assertEquals
		
	}

	@Test
	public void classAverage(){
		//asserEquals()
	}
	
	Student student10 = new Student("ian", "cole", "heffner", date3, eMajor.NURSING,
			"Cassies Road", "(302)-444-4352", "heman@mai.com");
}
