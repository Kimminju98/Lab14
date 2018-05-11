package edu.handong.csee.lab14.prob4;

public class Boundary {
	
	static int []arr = new int[5]; // int type array and this has 5 space
	static int count=0; // count is 0
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException { // this method throws arrayindexoutofboundsexception
		arr[count] = num; // count index's arr is num and if count are larger than 4 make exception
		System.out.printf("arr[%d] -< %d \n",count,num); // print out string
		count++; // count +1
	}

}
