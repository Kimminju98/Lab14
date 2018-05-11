package edu.handong.csee.lab14.prob5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner mys = new Scanner(System.in); // instantiate Scanner class
			String str = mys.nextLine(); // put user's string type value to str
			Main.test(str); // call test method
		}
		catch(MyException e) { // if MyException makes
			System.out.println("Inside catch block: "+e); // print out Inside catch block: and problem string and line of problem
		}
	}
	public static void test(String str) throws MyException{ // this method throws MyException
		if(str.equals("null")) { // if str is null
			throw new MyException("String val is null"); // make MyException with string
		}
		else // else
			System.out.println("String val is: "+str); // print out string
	}
}
