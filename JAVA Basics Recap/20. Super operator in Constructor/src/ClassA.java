
public class ClassA {
	
	int num;
	
	ClassA(){
		System.out.println("Its Class A constructor");
		
	}
	
	ClassA(int a){
		System.out.println("Its Class A Argument constructor 1: "+a);
		
	}
	
	ClassA(double a){
		System.out.println("Its Class A Argument constructor 2 "+a);
		
	}
	
	
	void display() {
		System.out.println("This is class A display.");
	}

	
	public static void main(String[] args) {		
		
		ClassB obj1 = new ClassB();
		obj1.display();		
		
		
		ClassB obj2 = new ClassB(206);
		ClassB obj3 = new ClassB(2.6);
		
		
	}
}
