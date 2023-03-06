
public class Class1 {
	
	
	int a = 100;
	int b = 101;
	
	
	public static void main(String[] args) {
		
		Class2 obj1 = new Class2();
		obj1.num1 = 1000;
		obj1.b=1010;
		
		obj1.display1();
		obj1.display2();
		
		
	}
	
	void display1(){
		System.out.println("This is written in class 1 display 1");
	}
	void display2(){
		System.out.println("This is written in class 1 display 2");
	}

}


//Here, Class 1 is parent class/base class/super class and Class 2 is Child class or sub class.... because B inherits/extends from A..
//Multiple inheritance is not available in java

/*
class Subclass/child class-name extends Superclass/base class/parent class -name  
{  
//methods and fields  
} 

*/
