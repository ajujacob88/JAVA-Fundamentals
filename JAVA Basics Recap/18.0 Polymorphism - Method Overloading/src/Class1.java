
//The same function name can be used for multiple functions/methods. This is polymorphism

//Type 1 - Method Overloading

public class Class1 {

	void aju() {
		int a=10;
		System.out.println(a);
	}
	
	void aju(int a) {
		a=20;
		System.out.println(a);
	}
	
	void aju(float a) {		
		//a=30;
		System.out.println(a);		
		
	}
	void aju(int a, double b) {
		a=220;
		System.out.println(a+ " " +b);
	}
	
	
	public static void main(String[] args) {
		Class1 Object1 = new Class1();
		Object1.aju();
		Object1.aju(252);
		Object1.aju(8.3f);  // in java, for using float function, write an f after the float value, otherwise it will take it as double. 
		Object1.aju(25,2.2);		
	}	
}

/*
Type 2 - Method Overriding

If the Methods or functions in CLass A and B have same function name, and if B inherits A, 
then while running the program, the arguments in the parent class will be overrided by the subclass...
Similarly in the case of variables also.....




 */
