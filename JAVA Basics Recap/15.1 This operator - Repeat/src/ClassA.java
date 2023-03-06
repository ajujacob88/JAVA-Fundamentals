
public class ClassA {
	
	static int a = 201;

	public static void main(String[] args) {
		
		ClassB object1 = new ClassB(121,122);
		
		object1.display();
		
		int b = 202;
		
		ClassB object2 = new ClassB(a,b);
		object2.display();
		
		object2.num1=301;
		object2.num4=302;
		object2.display();
		
	}
	
	
}
