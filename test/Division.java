package com.quinnox.test;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,result;
		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");
a= input.nextInt();
b= input.nextInt();
try {
	 result = a/b;
	 System.out.println("Result = " + result); 
	 
}
catch(ArithmeticException e) {
	System.out.println("Exception caught : Division by zero.");
	
}
finally { input.close();
System.out.println("in Finally Block");
}
		}

}
