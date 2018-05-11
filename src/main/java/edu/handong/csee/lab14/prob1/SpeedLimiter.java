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
				throw new Exception("Speed Limit " + this.limit + "Km exceeded!");
			}
			System.out.println("You are a law abiding citizen");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("You are being fined. ");
		}
		System.out.println("Your current speed: "+ this.speed);

	}

	public static void main(String[] args) {
		System.out.print("Set the speed limit, officer: ");
		Scanner mys = new Scanner(System.in);
		int speedLimit = mys.nextInt();
		Random random = new Random();
		int speed = random.nextInt(100)+1 ;
		SpeedLimiter sl = new SpeedLimiter(speedLimit,speed);
		sl.warnSpeedLimit();
	}
}