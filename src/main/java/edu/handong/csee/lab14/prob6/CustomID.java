package edu.handong.csee.lab14.prob6;

public class CustomID extends Exception{

	private String []kind = {"Vulcan","Romulan","Klingons"};
	private String name,race ;
	private int age;
	
	
	public CustomID(String name, int age, String race) throws Exception {
		
		if(name.length()<5) throw new Exception("Your name is short! Try again");
		this.name = name;
		System.out.println("Name is valid");
		System.out.println("Name: "+this.name);
	}
}
