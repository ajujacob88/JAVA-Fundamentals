/*
Type 2 - Method Overriding

If the Methods or functions in CLass A and B have same function name, and if B inherits A, 
then while running the program, the arguments in the parent class will be overrided by the subclass...
Similarly in the case of variables also.....
 */


// Super Operation

public class Class1 {
	
	public static void main(String[] args) {
		Class3 Object1 = new Class3();
		Object1.display();  //this is the concept of method overriding, here class 3(child class) display function overrides class 2 display.. this is the method overriding.
	
		Class3 Object2 = new Class3(20); // here by default the constructor in parent class will execute then followed by argument constructor in sub class will execute
		
		Class3 Object3 = new Class3(20,21); // if by using super we can execute both the argument constructor in parent class and sub class. Also super should be written first
	
	}

}
