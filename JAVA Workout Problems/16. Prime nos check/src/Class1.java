import java.util.Scanner;

public class Class1 {
	
	public static void main(String a[]) {
		
		System.out.println("Enter the no:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int flag = 0;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag++;
				break;
			}
		}
		if(flag==0)
			System.out.println("Entered number is a prime number ");
		else
			System.out.println("Entered number is not a prime number");
		
	}

}
