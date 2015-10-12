package com.cisc181.core;

public class PersonException extends Exception{
	
	private String Age;
	private String Number;
	
	
	public PersonException(String Age){
		this.Age = Age;
		System.out.println(Age);
	}
	
	public PersonException(String Number, String Age){
		this.Number = Number;
		
	}
	
	
	

}
