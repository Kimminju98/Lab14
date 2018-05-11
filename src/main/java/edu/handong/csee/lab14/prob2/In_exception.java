package edu.handong.csee.lab14.prob2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class In_exception {
	
	
	public static void main(String[] args) {
		Scanner mys = new Scanner(System.in);
		try {
			System.out.print("x :");
			int x = mys.nextInt();
			System.out.print("y :");
			int y = mys.nextInt();
			System.out.println(x/y);
		}
		catch(ArithmeticException e) {
			System.out.println("java.Lang.ArithmeticException: "+ e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException ");
		}
		catch(Exception e) {
			System.out.println("Some other exception has occurred" + e.getMessage());
		}
		
	}
	
}
