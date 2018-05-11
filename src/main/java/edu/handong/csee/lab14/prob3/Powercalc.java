package edu.handong.csee.lab14.prob3;

import java.util.Scanner;

public class Powercalc {

	private int n,p ; // n and p

	public long power(int n,int p) throws Exception { // type of return is long and this method thorws Excpetion because of this method not has try 
		long result = (long) Math.pow(n,p); // result is n to the power of the p
		if(n<0 || p <0) { // if n or p is smaller than 0
			throw new Exception("n or p should not be negative"); // make exception with string
		}
		if(n==0 && p ==0) { // if n and p are 0
			throw new Exception("n and p should not be zero"); // make exception with string
		}
		return result; // return result
	}
	public static void main(String[] args) {
		Scanner mys = new Scanner(System.in); // instantiate class of Scanner
		Powercalc my_calculator = new Powercalc(); // instatntiate class of Powercalc
		while(true) { // repeat continually
			try { 
				System.out.print("n :"); // print out string
				int n = mys.nextInt(); // put user's value to n
				System.out.print("p :"); // print out string
				int p = mys.nextInt(); // put user's value to p
				System.out.println(my_calculator.power(n,p)); // print out result of power method
				break; // if there is no exception, exit while statement
			}
			catch(Exception e) {
				System.out.println(e); // print out system comment and line of problem
			}
		}
	}

}
