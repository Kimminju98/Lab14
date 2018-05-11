package edu.handong.csee.lab14.prob4;

public class Boundary {
	
	static int []arr = new int[5];
	static int count=0;
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException {
		arr[count] = num;
		System.out.printf("arr[%d] -< %d \n",count,num);
		count++;
	}

}
