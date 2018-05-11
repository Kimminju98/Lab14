package edu.handong.csee.lab14.prob5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner mys = new Scanner(System.in);
			String str = mys.nextLine();
			Main.myTest(str);
		}
		catch(MyException e) {
			System.out.println("Inside catch block: "+e);
		}
	}
	public static void myTest(String str) throws MyException{
		if(str.equals("null")) {
			throw new MyException("String val is null");
		}
		else
			System.out.println("String val is: "+str);
	}
}
