package edu.handong.csee.lab14.prob5;

public class MyException extends Exception{ // MyException class inherits Exception

	private String message = null; // message is null
	
	public MyException() { // constructor of MyException
		super(); // call constructor of Exception
	}
	
	public MyException(String message) { // constructor of MyException with parameter that type is String
		super(message); // call constructor of Exception with string parameter
		this.message = message; // message of member is message of parameter
	}
	
	public MyException(Throwable cause) { // constructor of MyException with reference of Throwable class
		super(cause); // call constructor of Exception with reference
	}
	
	public String toString() { // toString method
		return message; // return message
	}
}
