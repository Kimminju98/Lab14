package edu.handong.csee.lab14.prob4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner mys = new Scanner(System.in);
		int num;
		Boundary b = new Boundary();
		
		while(true) {
			try {
				System.out.print("Enter an integer: ");
				num = mys.nextInt();
				b.receive(num);
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index access!");
				break;
			}
		}
	}
	
}
