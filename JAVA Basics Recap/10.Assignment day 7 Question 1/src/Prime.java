import java.util.Scanner;

// 1.	Write a java program to check whether a given number is prime or not

public class Prime {
	
	public static void main(String a[]){
		
		System.out.println("Enter a no:");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int flag=0;
		
		
		for(int i=2;i<num;i++) {
		
			if(num%i==0) {
				flag++;
				break;
			}
					
		}
	
		if(flag==0) {
			System.out.println("Prime no");
		}
		else{
			System.out.println("Not a prime no");
		}
	}
}
