
public class Class1 {
	
	Class1(){
		System.out.println("This is class 1 constructor");
	}
	
	static void staticdisplay() {
		System.out.println("This is class 1 static display");
	}
	
	void display() {
		System.out.println("This is class 2 display");
	}
	
	
	public static void main(String[] args) {
		
		Class3 obj1 = new Class3();
		
		obj1.display();
		
		staticdisplay();
		
		
		
	}
	
	

}
