import java.util.Scanner;

public class HelloSample {

	public static void main(String aju[]) {
		
		int a=10;
		System.out.println("Hello World"+a);
		
		System.out.println("Enter an int and float no:");
		
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		float c = s.nextFloat();
		

		System.out.println(b+ " & " +c);
		
		//sum		
		float sum = b+c;
		System.out.print("sum is "+sum);  //println is print in new line, ln is new line
		
		//find larger no
		if(b>c) {
			System.out.println(b+ "is larger");
		}
		else {
			System.out.println(c+ "is larger");   
		}
				
	}
	
}
