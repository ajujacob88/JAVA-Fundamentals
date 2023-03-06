
public class Class2 extends Class1 {
	
	int num;
	int c;
	
	Class2(){
		System.out.println("Its Class 2 constructor");
		
	}
	

	
	
	void display() {
		System.out.println("This is class 2 display. this is method over riding polymorphism.. if the methods have same name then the method will be executed from the child class, the method in parent class will be hided");
	
		super.display();
		
		num = 50;
		
		super.num = 125;
		
		c=num+super.num;
		
		System.out.println("num "+num+" + super num " +super.num+" = "+c+"This is the way super work in variable");
		
		
	}
	
	


}
