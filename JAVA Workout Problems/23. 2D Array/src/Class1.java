import java.util.Scanner;

public class Class1 {
	
	public static void main(String[] args) {
		
		int [][] array1 = new int[50][50];
		System.out.println("Enter the size of the array: ");
		Scanner s = new Scanner(System.in);
		int limit = s.nextInt();
		
		Class2 obj1 = new Class2();
		
		array1 = obj1.getArray(limit);
		
		obj1.displayArray(array1, limit);
		
	}

}
