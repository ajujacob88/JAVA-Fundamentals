import java.util.Scanner;

public class Class2 {
	
	int[][] getArray(int size) {
		int[][] arrayin = new int[50][50];
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the values of the array");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arrayin[i][j] = s.nextInt();				
			}			
		}
		return arrayin;	
	}
	
	void displayArray(int[][]arrayout,int limit) {
		System.out.println("The array elements are: ");
		for(int i=0;i<limit;i++) {
			for(int j=0;j<limit;j++) {
				System.out.print(arrayout[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
