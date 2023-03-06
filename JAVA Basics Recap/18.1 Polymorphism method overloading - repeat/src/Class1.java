
public class Class1 {
	
	
	public static void main(String[] args) {
		
		Class2 obj1 = new Class2();
		obj1.display();
		obj1.display(5);
		obj1.display(obj1.num,4.3);
		
	}
	
	void display() {
		System.out.println("hi");
	}
	
	void display(int i) {
		System.out.println(i);
	}
	
	void display(double i, double j) {
		System.out.println(i+" and " +j);
	}
	

}
