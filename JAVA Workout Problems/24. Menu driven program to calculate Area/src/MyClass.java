import java.util.Scanner;

//I think this is not the correct answer 

public class MyClass extends Area{
	
	public static void main(String[] args) {
		
		Area object1 = new Area();
		System.out.println("Enter your choice: 1 - Circle, 2 - Square, 3 - Rectangle, 4 - Triangle");
		Scanner s = new Scanner(System.in);
		
		
		object1.choice = s.nextInt();
		
		switch(object1.choice) {
		case 1:
			System.out.println("Enter the radius");
			object1.length = s.nextDouble();		
			object1.circle(object1.length);
			System.out.println(object1.area);
			break;
			
		case 2:
			System.out.println("Enter the length");
			object1.length = s.nextDouble();		
			object1.square(object1.length);
			System.out.println(object1.area);
			break;
			
		case 3:
			System.out.println("Enter the length and breadth");
			object1.length = s.nextDouble();		
			object1.breadth = s.nextDouble();
			object1.rectangle(object1.length,object1.breadth);
			System.out.println(object1.area);
			break;
			
		case 4:
			System.out.println("Enter the base and perpendicular height");
			object1.length = s.nextDouble();
			object1.breadth = s.nextDouble();	
			object1.triangle(object1.length, object1.breadth);
			System.out.println(object1.area);
			break;		
							
		}
								
	}
	/*
	void circle(double r) {
		
		area = 2*3.14*r;		
		
	}
	
	void square() {
		
	}
	
	void rectangle() {
		
	}
	
	void triangle() {
		
	}
*/
}
