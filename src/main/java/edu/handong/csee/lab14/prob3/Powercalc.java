package edu.handong.csee.lab14.prob3;

import java.util.Scanner;

public class Powercalc {

	private int n,p ;

	public long power(int n,int p) throws Exception {
		long result = (long) Math.pow(n,p);
		if(n<0 || p <0) {
			throw new Exception("n or p should not be negative");
		}
		if(n==0 && p ==0) {
			throw new Exception("n and p should not be zero");
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner mys = new Scanner(System.in);
		Powercalc my_calculator = new Powercalc();
		System.out.print("n :");
		int n = mys.nextInt();
		System.out.print("p :");
		int p = mys.nextInt();
		try {
			System.out.println(my_calculator.power(n,p));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
