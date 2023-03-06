import java.util.Scanner;

public class Class1 {
	
	public static void main(String[] args) {
		System.out.println("Enter the annual income: ");
		Scanner s = new Scanner(System.in);
		double tax=0;
		
		double income = s.nextDouble();
		if(income<=250000) {
			System.out.println("No tax to pay");
		}
		else if (income>250000 && income<=500000) {
			tax = (income * 5)/100 ;
			System.out.println("Tax Amount: "+tax);
		}
		else if (income>500000 && income<=1000000) {
			tax = (income * 20)/100 ;
			System.out.println("Tax Amount: "+tax);
		}
		else if (income>1000000 && income<=5000000) {
			tax = (income * 30)/100 ;
			System.out.println("Tax Amount: "+tax);
		}
		else if(income>5000000){
			System.out.println("Invalid range");
		}
	}

}
