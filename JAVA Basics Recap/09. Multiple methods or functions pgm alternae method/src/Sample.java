import java.util.Scanner;

public class Sample {
	
	public static void main(String a[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		
		
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		Sum x = new Sum();
		Sum y = new Sum();
		
		
		x.CalculateSum(n1,n2);
		x.DisplaySum();
		
		y.CalculateSum(10, 100);
		y.DisplaySum();
		
		int number1 = 25;
		int number2 = 30;
		
		Sum z = new Sum();
		z.CalculateSum(number1, number2);
		z.DisplaySum();
		
		y.DisplaySum();
		
		x.DisplaySum();
		
		z.DisplaySum();
	
		
		
		
		
		
	}

}
