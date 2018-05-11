package edu.handong.csee.lab14.prob1;

import java.util.Random;
import java.util.Scanner;

public class SpeedLimiter {

	private int limit;
	private int speed;

	public SpeedLimiter(int limit, int speed) {
		this.limit = limit;
		this.speed = speed;
	}

	public void warnSpeedLimit(){

		try {
			if(this.speed>this.limit) {
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