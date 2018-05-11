package edu.handong.csee.lab14.prob1;

import java.util.Random;
import java.util.Scanner;

public class SpeedLimiter {

	private int limit; // limit of speed
	private int speed; // speed
 
	public SpeedLimiter(int limit, int speed) { // constructor that has two parameter
		this.limit = limit; // limit of parameter is limit of member
		this.speed = speed; // limit of speed is limit of member
	}

	public void warnSpeedLimit(){

		try {
			if(this.speed>this.limit) { // if speed is lager than limit
				throw new Exception("Speed Limit " + this.limit + "Km exceeded!"); //make comment for exception
			}
			System.out.println("You are a law abiding citizen"); // if speed is not lager than limit, print out
		}
		catch(Exception e) { // if exception is occur
			System.out.println(e.getMessage()); //print string of problem in try 
			System.out.println("You are being fined. "); // print out the string
		}
		System.out.println("Your current speed: "+ this.speed); // always print out the string regardless of try

	}

	public static void main(String[] args) {
		System.out.print("Set the speed limit, officer: "); // print out
		Scanner mys = new Scanner(System.in); // instantiate Scanner class
		int speedLimit = mys.nextInt(); // put user's value to speedLimit
		Random random = new Random(); // instantiate Random class
		int speed = random.nextInt(100)+1 ; // put random number (1~100) to speed
		SpeedLimiter sl = new SpeedLimiter(speedLimit,speed); // instantiate SpeedLimiter class with speedLimit and speed
		sl.warnSpeedLimit(); // calss warnSpeedLimit method
	}
}