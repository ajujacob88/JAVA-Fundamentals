import java.util.Scanner;

public class ArraySample {
	
	public static void main(String a[]) {
		
		System.out.println("Enter the size of the matrix:");
		Scanner m = new Scanner (System.in);
		
		int size = m.nextInt();
		int[][] matrix = new int[50][50];
		
		System.out.println("Enter the values");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				matrix[i][j] = m.nextInt();
			}
		}
		
		System.out.println("The entered matrix is:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(" "+matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	

}
