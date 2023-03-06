
public class Class2 {
	
	int a =121;
	
	
	void display() {
		
		System.out.println(a);
		
		
		Class3 object1 = new Class3();
		object1.a =11;
		System.out.println(object1.a);
		System.out.println("This is class 2: "+a);
		object1.a = 255;
		object1.display();
	}

}
