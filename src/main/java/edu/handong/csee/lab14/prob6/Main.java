package edu.handong.csee.lab14.prob6;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		Scanner mys = new Scanner(System.in);
		String name;
		int age, state;
		String race;
		CustomID myc = new CustomID();



		while(true) {
			try {
				System.out.print("Enter your name: ");
				name = mys.nextLine();
				state=myc.custom_name(name);
				if(state==0) break;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}   
		}
		while(true) {
			try {
				System.out.print("Enter your age: ");
				age = mys.nextInt();
				mys.nextLine();
				state=myc.custom_age(age);
				if(state==0) break;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}   
		}

		while(true) {
			try {
				System.out.print("Enter your race: ");
				race = mys.nextLine();
				state=myc.custom_race(race);
				System.out.println("Race is valid");
				if(state==0) break;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}


	}
}