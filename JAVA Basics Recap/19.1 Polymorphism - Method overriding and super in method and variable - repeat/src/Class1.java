
public class Class1 {
	
	int num;
	
	Class1(){
		System.out.println("Its Class 1 constructor");
		
	}
	
	public static void main(String[] args) {		
		
		Class2 obj1 = new Class2();
		obj1.display();		
		
		System.out.println("object 1 num "+obj1.num+" object 1 c "+obj1.c);	
		
		
	}
	
	void display() {
		System.out.println("This is class 1 display. This can be executed by calling as super within subclass display..This way super work in method");
	}

}
