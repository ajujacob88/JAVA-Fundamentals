
public class ClassB extends ClassA {
	
	int num;
	
	
	ClassB(){
		System.out.println("Its Class B constructor");
		
	}
	
	ClassB(int a){
		System.out.println("Its Class B Argument constructor 1: "+a);
		
	}
	
	ClassB(double a){
		//super(1);   // we can call the required constructor using super. Also super should be the first statement in a constuctor
		super(32.3);
		//super();
		System.out.println("Its Class A Argument constructor 2: "+a);
		
	}
	

}
