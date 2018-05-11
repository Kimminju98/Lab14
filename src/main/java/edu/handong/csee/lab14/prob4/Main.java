package edu.handong.csee.lab14.prob4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner mys = new Scanner(System.in); // instantiate Scanner class
		int num; // num
		Boundary b = new Boundary(); // instantiate Boundary class
		
		while(true) { // repeat infinitly
			try {
				System.out.print("Enter an integer: "); // print out string
				num = mys.nextInt(); // put user's value to num
				b.receive(num); // call receive method
				
			}
			catch(ArrayIndexOutOfBoundsException e) { // if exception makes
				System.out.println("Invalid array index access!"); // print out string
				break; // exit while statement
			}
		}
	}
	
}
