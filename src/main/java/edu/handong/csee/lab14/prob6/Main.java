package edu.handong.csee.lab14.prob6;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		Scanner mys = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = mys.nextLine();
		System.out.print("Enter your age: ");
		int age = mys.nextInt();
		System.out.print("Enter your race: ");
		String race = mys.nextLine();
		
		try {
			CustomID id = new CustomID(name,age,race);
		}
		
	}
}
