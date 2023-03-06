import java.util.Scanner;

public class ForLoopSample {
	
	public static void main(String a[]) {
		
		System.out.println("Enter a number:");
		Scanner n = new Scanner(System.in);
		
		int limit = n.nextInt();
		int sum = 0;
		for(int i=0;i<=limit;i++) {
			sum = sum + i;
		}
		
		System.out.println("The sum of whole nos upto " +limit+ " is " +sum);
		
		
		
	}
	

}
