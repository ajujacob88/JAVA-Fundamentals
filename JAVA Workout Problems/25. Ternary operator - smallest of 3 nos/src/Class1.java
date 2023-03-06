import java.util.Scanner;

public class Class1 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the 3 nos:");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		
		int smallestnum = (num1<num2)?(num1<num3?num1:num3):(num2<num3?num2:num3);
		System.out.println("The smallest of the 3 nos entered is "+smallestnum);
		
	}

}
