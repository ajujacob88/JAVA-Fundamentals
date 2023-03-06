package com.ajujacob.ocja;   //created my package and written the code in my package... this is the standard form of writing code... refer durga sir 1:10:00 https://www.youtube.com/watch?v=5NQjLBuNL0I  ,,, if written, the package statement must be the first statement, and also atmost 1 package statement is allowed..

import java.util.Scanner;



public class JavaIfSample {

	public static void main(String a[]) {
		System.out.println("Enter the no:");
		Scanner number = new Scanner(System.in);
		
		float num = number.nextFloat();		
		
		if(num<0) {
			System.out.println("The entered no " +num+ " is negative");
		}
		else {
			System.out.println("The enterd no " +num+ " is positive");
		}
		
		
	}
	
	
	
	
	
	
}
