
public class Area {
	
	int choice;
	double length, breadth, area;
	
	void circle(double r) {
		
		area = 2*3.14*r;		
		
	}
	
	void square(double a) {
		area = 2*a;
	}
	
	void rectangle(double l,double b) {
		area = l*b;
	}
	
	void triangle(double b,double h) {
		area = (1/2)*b*h;
	}

}
