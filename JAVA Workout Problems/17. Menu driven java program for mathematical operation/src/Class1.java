import java.util.Scanner;

public class Class1 {
	
	public static void main(String a[]) {		
		
		Scanner s = new Scanner(System.in);	
		
		Operation task = new Operation();
		
		System.out.println("Enter the 2 numbers: ");
		task.num1 = s.nextDouble();
		task.num2 = s.nextDouble();
		
		System.out.println("Enter the code for the operations to perform: \n 1 - Addition\n 2 - Substraction\n 3 - Multiplication\n 4 - Division");
		task.optn = s.nextInt();
		
		switch(task.optn) {
		case 1:
			task.Addition(task.num1,task.num2);
			break;
		case 2:
			task.Substraction(task.num1,task.num2);
			break;
		case 3:
			task.Multiplication(task.num1,task.num2);
			break;
		case 4:
			task.Division(task.num1,task.num2);
			break;
		default:
			System.out.println("Invalid entry");
			break;
		}
		
	}	

}
