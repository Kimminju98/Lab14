package edu.handong.csee.lab14.prob6;

public class CustomID extends Exception{

	private String []kind = {"Vulcan","Romulan","Klingons"};
	private String name,race ;
	private int age;
	
	
	public int custom_name(String name) throws Exception{
		if(name.length()<5) {
			throw new Exception("Your name is short! Try again");
		}
		return 0;
	}
	
	public int custom_age(int age) throws Exception{
		if(age<18) {
			throw new Exception("You are too young! Try again");
		}
		return 0;
	}
	public int custom_race(String race) throws Exception{
		if(race.equals(kind[0]) || race.equals(kind[1]) || race.equals(kind[2])) {
			return 0;
		}
		else {
			throw new Exception("Human! Try again");
		}
	}
	
	
}
