package edu.handong.csee.lab14.prob2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class In_exception {
	
	
	public static void main(String[] args) {
		Scanner mys = new Scanner(System.in); // instantiate Scanner class
		try {
			System.out.print("x :"); // print out
			int x = mys.nextInt(); // put user's int type value to x
			System.out.print("y :"); // print out
			int y = mys.nextInt(); // put user's int type value to y
			System.out.println(x/y); // print out result of x/y
		}
		catch(ArithmeticException e) { // if y is 0
			System.out.println("java.Lang.ArithmeticException: "+ e.getMessage()); //print out string and line of problem
		}
		catch(InputMismatchException e) { // if x or y is not int type int try
			System.out.println("java.util.InputMismatchException "); // print out string
		}
		catch(Exception e) { // if other problem occur
			System.out.println("Some other exception has occurred" + e.getMessage()); // print out string and line of problem
		}
		
	}
	
}
