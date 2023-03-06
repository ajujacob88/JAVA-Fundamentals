
public class MainClass {
	
	public static void main(String[] args) {
		
		B object1 = new B();
		
		object1.a = 25;
		object1.display1();
		object1.display2();
		
		A object2 = new A();
		object2.display1();
	}

}

//Here, Class A is parent class/base class and Class B is Child class or sub class.... because B inherits/extends from A..
// Multiple inheritance is not available in java

/*
class Subclass/child class-name extends Superclass/base class/parent class -name  
{  
   //methods and fields  
} 

 */