import java.util.Scanner;

// Write a menu driven java program to do the basic mathematical operations such as addition, subtraction, multiplication and division 

public class MathematicalOperations {
	public static void main(String a[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the operation: \n1 - Addition, \n2- Subst, \n3 - Multiply, \n4 - Division ");
		int task = s.nextInt();
		System.out.println("Enter the 2 nos:");
		float num1 = s.nextFloat();
		float num2 = s.nextFloat();
		
		OperationMethods type = new OperationMethods();
		
		type.Operation(task, num1, num2);
		
		
		
		
	}

}
