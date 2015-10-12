package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import com.cisc181.core.Staff;
import com.cisc181.core.Person;
import com.cisc181.eNums.eTitle;

import org.junit.Test;
import org.junit.Before;

public class Staff_Test {
	Date date1 = new Date();
	Date date2 = new Date();

	Staff Test1;
	Staff Test2;
	Staff Test3;
	Staff Test4;
	Staff Test5;
	Staff badtest;
	
	
	
	@Before
	public void setUp(){
		Staff Staff1 = new Staff("Charlie", "Will", "Smith", date1, "Wills Road",
				"(302)-345-2342", "anemail@mil.com", "monday 5", 5, 70.5, date2, eTitle.TEACHER);
		Staff Staff2 = new Staff("Charlie", "Will", "Smith", date1, "Wills Road",
				"(302)-345-2342", "anemail@mil.com", "monday 5", 5, 30.5, date2, eTitle.TEACHER);
		Staff Staff3 = new Staff("Charlie", "Will", "Smith", date1, "Wills Road",
				"(302)-345-2342", "anemail@mil.com", "monday 5", 5, 10.5, date2, eTitle.TEACHER);
		Staff Staff4 = new Staff("Charlie", "Will", "Smith", date1, "Wills Road",
				"(302)-345-2342", "anemail@mil.com", "monday 5", 5, 110.5, date2, eTitle.TEACHER);
		Staff Staff5 = new Staff("Charlie", "Will", "Smith", date1, "Wills Road",
				"(302)-345-2342", "anemail@mil.com", "monday 5", 5, 55.5, date2, eTitle.TEACHER);
		Staff StaffBad = new Staff("Charlie", "Will", "Smith", date1, "Wills Road",
				"3023452342", "anemail@mil.com", "monday 5", 5, 55.5, date2, eTitle.TEACHER);
		Test1 = Staff1;
		Test2 = Staff2;
		Test3 = Staff3;
		Test4 = Staff4;
		Test5 = Staff5;
		badtest = StaffBad;
		
		ArrayList<Staff> Staffs = new ArrayList(
				Arrays.asList(Staff1, Staff2, Staff3, Staff4, Staff5));

	}
	
	@Test
	public void testSaleries(){
		//assertEquals((Staff1(salary) + Staff2(salary) + 
		//		Staff3(salary) + Staff4(salary) + Staff5(salary)) / 5 , 55.5);
	}
	
	@Test
	public void testNumber() throws PersonException{
	//	assertEquals(StaffBad, throw PersonException);
	}

}
