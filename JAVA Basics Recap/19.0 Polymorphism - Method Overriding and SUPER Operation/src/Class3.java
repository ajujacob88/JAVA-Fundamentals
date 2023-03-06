
public class Class3 extends Class2{

	int a =50;
	void display() {
		super.display();
		System.out.println("This is class 3 " +a);
		
		//a=20;
		super.a = 999; // assign the value of 999 to variable a in class 2(please not its class 2)
		System.out.println("a is " +a+ " and super a is " +super.a);
		super.display();
		
		a= a+super.a; // a is in class 3 and super a is the a in class 2 
		System.out.println(a);
	}
	
	Class3(){		
		System.out.println("It's constructor of Class 3");
	}
	
	Class3(int a){
		System.out.println("It's argument constructor of class 3");
	}
	
	Class3(int a, int b){
		super(10, 15);
		System.out.println("It's another argument constructor of class 3");
	}
	
	
}
