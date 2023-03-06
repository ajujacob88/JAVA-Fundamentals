import java.util.Scanner;

public class JavaFunctionSample {
	
//function with argument and with return value	
	
	public static void main(String aju[]) {
		
		System.out.println("Enter 2 numbers:");
		Scanner s = new Scanner (System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		int answer = add(num1,num2);
		
		System.out.println("Sum of " +num1+ " & " +num2+ " is " +answer );


		
		
	}
	
	static int add(int a, int b) {
		
		int sum = a+b;
		return sum;
		
		
	}
	

}
