
public class Hello {
	
	int x=0;
	
	public static void main(String a[]) {
		First f = new First();
		f.display1();
		
		First object2 = new First();
		object2.display1();
		
		Second object3 = new Second();
		object3.display2();
		
		object3.display3();
		
		Hello object5 = new Hello();
		object5.x = 20;
		object5.hai();	
		System.out.println(object5.x);
		
		object3.z=4;
		System.out.println(object3.z);
		
		}
		
	void hai(){		
		System.out.println("hai");
		
	}

}
