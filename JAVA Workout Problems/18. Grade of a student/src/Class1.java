import java.util.Scanner;

public class Class1 {
	
	public static void main(String[] args) {
		System.out.println("Enter the mark of written test: ");
		Scanner s = new Scanner(System.in);
		double writtentest = s.nextDouble();		
		System.out.println("Enter the mark of Lab Exam: ");
		double labexam = s.nextDouble();
		System.out.println("Enter the mark of Assignment: ");
		double assignment = s.nextDouble();
		
		if(writtentest>=0 && writtentest<=100 && labexam >= 0 && labexam<=100 && assignment>=0 && assignment<=100 ) {
			double grade = ((writtentest*70)/100 + (labexam*20)/100 +(assignment*10)/100);
			System.out.println("Grade of the student is "+grade);		
		}
		else
			System.out.println("Invalid mark entry");
	}
}
