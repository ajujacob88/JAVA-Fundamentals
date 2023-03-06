
public class Class2 {
	
	int a =20;
	void display() {
		System.out.println("This is class 2 "+a);
	}
	
	Class2(){
		System.out.println("It's constructor of class 2");
	}

	Class2(int a){
		System.out.println("It's argument constructor of class 2");
	}
	
	Class2(int a, int b){
		System.out.println("It's another argument constructor of class 2");
	}
}
